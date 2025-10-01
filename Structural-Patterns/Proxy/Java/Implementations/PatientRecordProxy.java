package Implementations;

import Interfaces.IPatientRecord;
import Models.MriScan;

public class PatientRecordProxy implements IPatientRecord{
    private IPatientRecord realPatientRecord;
    private String patientId;

    public PatientRecordProxy(String patientId){
        this.patientId = patientId;
        System.out.println("[VirtualProxy] Created lightweight proxy for patient " + patientId + ". Real record not yet loaded.");
    }

    private IPatientRecord getPatientRecord(){
        if(realPatientRecord == null){
            System.out.println("[VirtualProxy] First access! Now creating the real, heavy patient record...");
            realPatientRecord = new PatientRecord(patientId);
        }
        return realPatientRecord;
    }

    @Override
    public String getPatientInfo() {
        return getPatientRecord().getPatientInfo();
    }

    @Override
    public String getClinicalNotes() {
        return getPatientRecord().getClinicalNotes();
    }

    @Override
    public MriScan getMriScan() {
        return getPatientRecord().getMriScan();
    }

    @Override
    public String getLabResults() {
        return getPatientRecord().getLabResults();
    }    
}
