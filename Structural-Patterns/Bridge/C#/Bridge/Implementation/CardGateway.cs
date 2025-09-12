public class CardGateway : IPaymentGateway {
    public void ProcessPayment(double amount) {
        Console.WriteLine("Processing payment of Rs." + amount + " via UPI.");
    }

    public void RefundPayment(String transactionId, double amount) {
        Console.WriteLine("Refunding Rs." + amount + " for transaction " + transactionId + " via UPI.");
    }
}
