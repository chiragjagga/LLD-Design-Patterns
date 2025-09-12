public interface IPaymentGateway {
    public void ProcessPayment(double amount);

    public void RefundPayment(String transactionId, double amount);
}
