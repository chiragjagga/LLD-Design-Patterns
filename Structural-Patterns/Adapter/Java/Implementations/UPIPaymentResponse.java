package Implementations;

public class UPIPaymentResponse {
    private String transactionId;
    private PaymentStatus status;
    
    public UPIPaymentResponse(String transactionId, PaymentStatus status){
        this.transactionId = transactionId;
        this.status = status;
    }

    public String getTransactionId(){
        return this.transactionId;
    }

    public PaymentStatus getStatus(){
        return this.status;
    }
}
