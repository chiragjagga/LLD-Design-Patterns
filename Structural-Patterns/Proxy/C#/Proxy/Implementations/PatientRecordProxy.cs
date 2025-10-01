public class PatientRecordProxy : IPatientRecord{
    private IPatientRecord? realPatientRecord;
    private String patientId;

    public PatientRecordProxy(String patientId){
        this.patientId = patientId;
        Console.WriteLine("[VirtualProxy] Created lightweight proxy for patient " + patientId + ". Real record not yet loaded.");
    }

    private IPatientRecord getPatientRecord(){
        if (realPatientRecord == null)
        {
            Console.WriteLine("[VirtualProxy] First access! Now creating the real, heavy patient record...");
            realPatientRecord = new PatientRecord(patientId);
       
        }
        return realPatientRecord;
    }
    public String getPatientInfo() {
        return getPatientRecord().getPatientInfo();
    }

    public String getClinicalNotes() {
        return getPatientRecord().getClinicalNotes();
    }

    public MriScan getMriScan() {
        return getPatientRecord().getMriScan();
    }

    public String getLabResults() {
        return getPatientRecord().getLabResults();
    }    
}
