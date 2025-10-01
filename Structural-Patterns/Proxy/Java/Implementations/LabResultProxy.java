package Implementations;

import Interfaces.ILabResultsService;

public class LabResultProxy implements ILabResultsService {

    @Override
    public String fetchResults(String patientId) {
        System.out.println("   [RemoteProxy] Connecting to external LabCorp API...");
        System.out.println("   [RemoteProxy] Authenticating and sending request for patient " + patientId + "...");
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        System.out.println("   [RemoteProxy] Received and parsed JSON response.");
        return "Lab Results for " + patientId + ": {WBC: 12.5, HGB: 14.2}";
    }
    
}
