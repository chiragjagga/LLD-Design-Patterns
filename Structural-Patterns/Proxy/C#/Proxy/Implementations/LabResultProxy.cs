public class LabResultProxy : ILabResultsService {

    public String fetchResults(String patientId) {
        Console.WriteLine("   [RemoteProxy] Connecting to external LabCorp API...");
        Console.WriteLine("   [RemoteProxy] Authenticating and sending request for patient " + patientId + "...");
        try { Thread.Sleep(1500); } catch (Exception) {}
        Console.WriteLine("   [RemoteProxy] Received and parsed JSON response.");
        return "Lab Results for " + patientId + ": {WBC: 12.5, HGB: 14.2}";
    }
    
}
