public class GPayAdapter : IUPIPaymentGateway{

    private GPayAPI gPayAPI = new GPayAPI();

    public UPIPaymentResponse InitiatePayment(UPIPaymentRequest request) {
        Console.WriteLine("--> Using GooglePayAdapter to translate our request...");
        String transactionId = gPayAPI.startPayment(request.GetOrderId());

        PaymentStatus status = PaymentStatus.SUCCESS;

        return new UPIPaymentResponse(transactionId, status);
    }

    public PaymentStatus CheckStatus(String transactionId) {
        String status = gPayAPI.fetchStatus(transactionId);
        return PaymentStatus.SUCCESS;
    }
    
}
