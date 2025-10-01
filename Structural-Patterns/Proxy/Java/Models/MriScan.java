package Models;

public class MriScan {
    private final String scanData;
    
    public MriScan(String patientId) {
        System.out.println("   [RealRecord] Loading large MRI scan data for patient " + patientId + "...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {
            System.out.println("   [RealRecord] MRI load failed for patient " + patientId + "...");
        }
        this.scanData = "MRI_DATA_FOR_" + patientId;
    }
    
    public String getData() { return scanData; }
}
