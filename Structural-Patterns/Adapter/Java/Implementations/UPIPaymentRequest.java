package Implementations;

public class UPIPaymentRequest {
    private String orderId;
    private double amount;
    private String customerUpiId;

    public UPIPaymentRequest(String orderId, double amount, String upiId){
        this.orderId = orderId;
        this.amount = amount;
        this.customerUpiId = upiId;
    }

    public String getOrderId(){
        return this.orderId;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getCustomerUpiId(){
        return this.customerUpiId;
    }
}