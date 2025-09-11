public class UPIPaymentResponse {
    private String transactionId;
    private PaymentStatus status;
    
    public UPIPaymentResponse(String transactionId, PaymentStatus status){
        this.transactionId = transactionId;
        this.status = status;
    }

    public String GetTransactionId(){
        return this.transactionId;
    }

    public PaymentStatus GetStatus(){
        return this.status;
    }
}
