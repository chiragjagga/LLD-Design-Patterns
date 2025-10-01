public class PatientRecord : IPatientRecord {
    private String patientId;
    private String? patientInfo;
    private String? clinicalNotes;
    private MriScan? mriScan;
    private ILabResultsService labResultsService;

    public PatientRecord(String patientId) {
        this.patientId = patientId;
        this.labResultsService = new LabResultProxy(); // Using a remote proxy
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        Console.WriteLine("[RealRecord] Connecting to database and loading full record for patient " + patientId + "...");
        try { Thread.Sleep(3000); } catch (Exception) {}
        this.patientInfo = "Name: John Doe, DOB: 1980-01-15";
        this.clinicalNotes = "Patient presents with symptoms of acute appendicitis...";
        Console.WriteLine("[RealRecord] Finished loading core data.");
    }

    public String getPatientInfo() { return patientInfo; }

    public String getClinicalNotes() { return clinicalNotes; }

    public MriScan getMriScan() {
        // Lazy loading
        if (this.mriScan == null) {
            this.mriScan = new MriScan(this.patientId);
        }
        return this.mriScan;
    }
    
    public String getLabResults() {
        // Delegate to the remote proxy
        return this.labResultsService.fetchResults(this.patientId);
    }
}
