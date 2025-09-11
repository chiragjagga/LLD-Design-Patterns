package Adaptee;

public class GPayAPI {
    public String startPayment(String orderId){
        System.out.println("Google Pay API: Starting payment for " + orderId + "...");
        return "GPAY" + System.currentTimeMillis();
    }

    public String fetchStatus(String transactionId){
        return "SUCCESS";
    }
}
