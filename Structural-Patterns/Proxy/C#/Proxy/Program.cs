// See https://aka.ms/new-console-template for more information

public class Program
{
    public static void Main(String[] args)
    {
        String patientId = "Ramesh-12345";
        
        // Create the users
        User doctor = new User("Dr. Ram", Role.DOCTOR);
        User clerk = new User("Geeta", Role.BILLING_CLERK);
        
        Console.WriteLine("--- Scenario 1: Doctor Ram accesses the patient record ---");
        // Lightweight Virtual Proxy
        IPatientRecord record = new PatientRecordProxy(patientId);
        
        // It wraps the Protection Proxy
        record = new PatientRecordProtectionProxy(record, doctor);
        
        // Finally, it wraps it in the Smart Proxy
        record = new AuditCachingPatientRecordProxy(record, doctor);

        // Doctor accesses the record for the first time
        Console.WriteLine("\nDoctor is opening the file...");
        
        // This call will trigger the entire chain: Smart -> Protection -> Virtual -> Real
        Console.WriteLine("Info: " + record.getPatientInfo());
        Console.WriteLine("Notes: " + record.getClinicalNotes());
        
        Console.WriteLine("\nDoctor is viewing the MRI for the FIRST time...");
        MriScan scan1 = record.getMriScan();
        Console.WriteLine("MRI Data: " + scan1.getData());
        
        Console.WriteLine("\nDoctor is viewing the MRI for the SECOND time...");
        MriScan scan2 = record.getMriScan(); // This should be fast!
        Console.WriteLine("MRI Data: " + scan2.getData());
        
        Console.WriteLine("\nDoctor is checking external lab results...");
        Console.WriteLine(record.getLabResults());

        Console.WriteLine("\n--- Scenario 2: Billing Clerk Alice accesses the same record ---");
        
        IPatientRecord clerkRecord = new PatientRecordProxy(patientId);
        clerkRecord = new PatientRecordProtectionProxy(clerkRecord, clerk);
        clerkRecord = new AuditCachingPatientRecordProxy(clerkRecord, clerk);

        Console.WriteLine("\nClerk is opening the file...");
        // This will succeed because basic info is allowed for all roles.
        // Note: It will create a NEW RealPatientRecord because it's a different proxy chain.
        // A real system might share the underlying real object.
        Console.WriteLine("Info: " + clerkRecord.getPatientInfo());

        Console.WriteLine("\nClerk attempts to view sensitive notes...");
        try {
            Console.WriteLine(clerkRecord.getClinicalNotes());
        } catch (Exception e) {
            Console.WriteLine("ERROR: " + e.Message);
        }
    }
}
        
