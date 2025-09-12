package Implementation;

public class CardGateway implements IPaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs." + amount + " via UPI.");
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding Rs." + amount + " for transaction " + transactionId + " via UPI.");
    }
}
