public interface IUPIPaymentGateway {
    UPIPaymentResponse InitiatePayment(UPIPaymentRequest request);
    PaymentStatus CheckStatus(String transactionId);
}