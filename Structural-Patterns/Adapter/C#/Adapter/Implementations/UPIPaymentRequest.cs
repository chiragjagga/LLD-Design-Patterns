public class UPIPaymentRequest {
    private String orderId;
    private double amount;
    private String customerUpiId;

    public UPIPaymentRequest(String orderId, double amount, String upiId){
        this.orderId = orderId;
        this.amount = amount;
        this.customerUpiId = upiId;
    }

    public String GetOrderId(){
        return this.orderId;
    }

    public double GetAmount(){
        return this.amount;
    }

    public String GetCustomerUpiId(){
        return this.customerUpiId;
    }
}