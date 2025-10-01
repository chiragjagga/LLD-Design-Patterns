import Enums.Role;
import Interfaces.IPatientRecord;
import Implementations.AuditCachingPatientRecordProxy;
import Implementations.PatientRecordProxy;
import Implementations.PatientRecordProtectionProxy;
import Models.MriScan;
import Models.User;

public class Proxy {
    public static void main(String[] args) {
        String patientId = "Ramesh-12345";
        
        // Create the users
        User doctor = new User("Dr. Ram", Role.DOCTOR);
        User clerk = new User("Geeta", Role.BILLING_CLERK);
        
        System.out.println("--- Scenario 1: Doctor Ram accesses the patient record ---");
        // Lightweight Virtual Proxy
        IPatientRecord record = new PatientRecordProxy(patientId);
        
        // It wraps the Protection Proxy
        record = new PatientRecordProtectionProxy(record, doctor);
        
        // Finally, it wraps it in the Smart Proxy
        record = new AuditCachingPatientRecordProxy(record, doctor);

        // Doctor accesses the record for the first time
        System.out.println("\nDoctor is opening the file...");
        
        // This call will trigger the entire chain: Smart -> Protection -> Virtual -> Real
        System.out.println("Info: " + record.getPatientInfo());
        System.out.println("Notes: " + record.getClinicalNotes());
        
        System.out.println("\nDoctor is viewing the MRI for the FIRST time...");
        MriScan scan1 = record.getMriScan();
        System.out.println("MRI Data: " + scan1.getData());
        
        System.out.println("\nDoctor is viewing the MRI for the SECOND time...");
        MriScan scan2 = record.getMriScan(); // This should be fast!
        System.out.println("MRI Data: " + scan2.getData());
        
        System.out.println("\nDoctor is checking external lab results...");
        System.out.println(record.getLabResults());

        System.out.println("\n--- Scenario 2: Billing Clerk Alice accesses the same record ---");
        
        IPatientRecord clerkRecord = new PatientRecordProxy(patientId);
        clerkRecord = new PatientRecordProtectionProxy(clerkRecord, clerk);
        clerkRecord = new AuditCachingPatientRecordProxy(clerkRecord, clerk);

        System.out.println("\nClerk is opening the file...");
        // This will succeed because basic info is allowed for all roles.
        // Note: It will create a NEW RealPatientRecord because it's a different proxy chain.
        // A real system might share the underlying real object.
        System.out.println("Info: " + clerkRecord.getPatientInfo());

        System.out.println("\nClerk attempts to view sensitive notes...");
        try {
            System.out.println(clerkRecord.getClinicalNotes());
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
