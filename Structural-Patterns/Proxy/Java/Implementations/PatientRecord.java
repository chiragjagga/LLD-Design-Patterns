package Implementations;

import Interfaces.ILabResultsService;
import Interfaces.IPatientRecord;
import Models.MriScan;

public class PatientRecord implements IPatientRecord {
    private String patientId;
    private String patientInfo;
    private String clinicalNotes;
    private MriScan mriScan;
    private ILabResultsService labResultsService;

    public PatientRecord(String patientId) {
        this.patientId = patientId;
        this.labResultsService = new LabResultProxy(); // Using a remote proxy
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println("[RealRecord] Connecting to database and loading full record for patient " + patientId + "...");
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        this.patientInfo = "Name: John Doe, DOB: 1980-01-15";
        this.clinicalNotes = "Patient presents with symptoms of acute appendicitis...";
        System.out.println("[RealRecord] Finished loading core data.");
    }

    @Override
    public String getPatientInfo() { return patientInfo; }

    @Override
    public String getClinicalNotes() { return clinicalNotes; }

    @Override
    public MriScan getMriScan() {
        // Lazy loading
        if (this.mriScan == null) {
            this.mriScan = new MriScan(this.patientId);
        }
        return this.mriScan;
    }
    
    @Override
    public String getLabResults() {
        // Delegate to the remote proxy
        return this.labResultsService.fetchResults(this.patientId);
    }
}
