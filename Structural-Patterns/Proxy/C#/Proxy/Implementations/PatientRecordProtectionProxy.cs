public class PatientRecordProtectionProxy : IPatientRecord {
    
    private IPatientRecord wrappedRecord;
    private User user;

    public PatientRecordProtectionProxy(IPatientRecord patientRecord, User user){
        this.wrappedRecord = patientRecord;
        this.user = user;
    }

    public String getPatientInfo(){
        return wrappedRecord.getPatientInfo();
    }

    public String getClinicalNotes(){
        if(user.getRole() != Role.DOCTOR) throw new Exception("Access Denied: " + user.getRole() + " cannot view clinical notes.");
        return wrappedRecord.getClinicalNotes();
    }

    public MriScan getMriScan(){
        if(user.getRole() != Role.DOCTOR) throw new Exception("Access Denied: " + user.getRole() + " cannot view MRI scan.");
        return wrappedRecord.getMriScan();
    }

    public String getLabResults(){
        if(user.getRole() != Role.DOCTOR) throw new Exception("Access Denied: " + user.getRole() + " cannot view lab results.");
        return wrappedRecord.getLabResults();
    }
}
