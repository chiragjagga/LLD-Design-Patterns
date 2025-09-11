public class PhonepeAdapter : IUPIPaymentGateway{

    private PhonepeAPI phonepeAPI = new PhonepeAPI();

    public UPIPaymentResponse InitiatePayment(UPIPaymentRequest request) {
        Console.WriteLine("--> Using PhonePeAdapter to translate our request...");

        String transactionId = phonepeAPI.createTransaction(request.GetOrderId());
        return new UPIPaymentResponse(transactionId, PaymentStatus.PENDING);
    }

    public PaymentStatus CheckStatus(String transactionId) {
        int status = phonepeAPI.fetchStatus(transactionId);
        
        return (status == 200) ? PaymentStatus.SUCCESS : PaymentStatus.FAILED;
    }
    
}
