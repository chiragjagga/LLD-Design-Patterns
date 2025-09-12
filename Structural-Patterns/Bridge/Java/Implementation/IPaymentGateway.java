package Implementation;

public interface IPaymentGateway {
    public void processPayment(double amount);

    public void refundPayment(String transactionId, double amount);
}
