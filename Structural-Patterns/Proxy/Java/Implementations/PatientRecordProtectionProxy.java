package Implementations;

import Interfaces.IPatientRecord;
import Models.MriScan;
import Models.User;

class AccessDeniedException extends RuntimeException {
    public AccessDeniedException(String message) { super(message); }
}

public class PatientRecordProtectionProxy implements IPatientRecord {
    
    private IPatientRecord wrappedRecord;
    private User user;

    public PatientRecordProtectionProxy(IPatientRecord patientRecord, User user){
        this.wrappedRecord = patientRecord;
        this.user = user;
    }

    @Override
    public String getPatientInfo(){
        return wrappedRecord.getPatientInfo();
    }

    @Override
    public String getClinicalNotes(){
        if(user.getRole() != Enums.Role.DOCTOR) throw new AccessDeniedException("Access Denied: " + user.getRole() + " cannot view clinical notes.");
        return wrappedRecord.getClinicalNotes();
    }

    @Override
    public MriScan getMriScan(){
        if(user.getRole() != Enums.Role.DOCTOR) throw new AccessDeniedException("Access Denied: " + user.getRole() + " cannot view MRI scan.");
        return wrappedRecord.getMriScan();
    }

    @Override
    public String getLabResults(){
        if(user.getRole() != Enums.Role.DOCTOR) throw new AccessDeniedException("Access Denied: " + user.getRole() + " cannot view lab results.");
        return wrappedRecord.getLabResults();
    }
}
