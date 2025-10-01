package Implementations;

import java.util.HashMap;
import java.util.Map;

import Interfaces.IPatientRecord;
import Models.MriScan;
import Models.User;

public class AuditCachingPatientRecordProxy implements IPatientRecord {
    
    private IPatientRecord wrappedRecord;
    private User user;
    private Map<String, MriScan> mriCache = new HashMap<>();

    public AuditCachingPatientRecordProxy(IPatientRecord patientRecord, User user){
        this.wrappedRecord = patientRecord;
        this.user = user;
    }

    private void logAccess(String action) {
        System.out.println("[SmartProxy-Audit] User '" + user.getName() + "' performed action: " + action);
    }

    @Override
    public String getPatientInfo() {
        logAccess("VIEW_PATIENT_INFO");
        return wrappedRecord.getPatientInfo();
    }

    @Override
    public String getClinicalNotes() {
        logAccess("VIEW_CLINICAL_NOTES");
        return wrappedRecord.getClinicalNotes();
    }

    @Override
    public MriScan getMriScan() {
        logAccess("VIEW_MRI_SCAN");
        String patientId = wrappedRecord.getPatientInfo().split(",")[0];

        if(mriCache.containsKey(patientId)){
            System.out.println("[SmartProxy-Cache] MRI scan found in cache. Returning instantly.");
            return mriCache.get(patientId);
        }
        else{
            System.out.println("[SmartProxy-Cache] MRI scan not in cache. Fetching from source...");
            MriScan scan = wrappedRecord.getMriScan();
            mriCache.put(patientId, scan);
            return scan;
        }
    }

    @Override
    public String getLabResults() {
        logAccess("VIEW_LAB_RESULTS");
        return wrappedRecord.getLabResults();
    }
}
