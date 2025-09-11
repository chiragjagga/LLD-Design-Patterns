package Adaptee;

public class PhonepeAPI {
    public String createTransaction(String orderId){
        System.out.println("PhonePe API: Creating transaction for " + orderId + "...");
        return "PP" + System.currentTimeMillis();
    }

    public int fetchStatus(String transactionId){
        System.out.println("PhonePe API: Checking status for " + transactionId);
        return 200;
    }
}
