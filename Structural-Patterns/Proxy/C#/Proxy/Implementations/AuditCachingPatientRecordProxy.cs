using System.Collections;
using System.Collections.Generic;

public class AuditCachingPatientRecordProxy : IPatientRecord {
    
    private IPatientRecord wrappedRecord;
    private User user;
    private IDictionary<String, MriScan> mriCache = new Dictionary<String, MriScan>();

    public AuditCachingPatientRecordProxy(IPatientRecord patientRecord, User user){
        this.wrappedRecord = patientRecord;
        this.user = user;
    }

    private void logAccess(String action) {
        Console.WriteLine("[SmartProxy-Audit] User '" + user.getName() + "' performed action: " + action);
    }

    public String getPatientInfo() {
        logAccess("VIEW_PATIENT_INFO");
        return wrappedRecord.getPatientInfo();
    }

    public String getClinicalNotes() {
        logAccess("VIEW_CLINICAL_NOTES");
        return wrappedRecord.getClinicalNotes();
    }

    public MriScan getMriScan() {
        logAccess("VIEW_MRI_SCAN");
        String patientId = wrappedRecord.getPatientInfo().Split(",")[0];

        if(mriCache.ContainsKey(patientId)){
            Console.WriteLine("[SmartProxy-Cache] MRI scan found in cache. Returning instantly.");
            return mriCache[patientId];
        }
        else{
            Console.WriteLine("[SmartProxy-Cache] MRI scan not in cache. Fetching from source...");
            MriScan scan = wrappedRecord.getMriScan();
            mriCache.Add(patientId, scan);
            return scan;
        }
    }

    public String getLabResults() {
        logAccess("VIEW_LAB_RESULTS");
        return wrappedRecord.getLabResults();
    }
}
