public class MriScan {
    private readonly String scanData;
    
    public MriScan(String patientId) {
        Console.WriteLine("   [RealRecord] Loading large MRI scan data for patient " + patientId + "...");
        try { Thread.Sleep(2000); } catch (Exception)
        {
            Console.WriteLine("   [RealRecord] MRI load failed for patient " + patientId + "...");
        }
        this.scanData = "MRI_DATA_FOR_" + patientId;
    }
    
    public String getData() { return scanData; }
}
