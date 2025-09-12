public class OneTimePayment(IPaymentGateway gateway, double amount) : Payment(gateway) {

    private double amount = amount;
    private String transactionId = "";

    public override void MakePayment() {
        Console.WriteLine("Initiating a one-time purchase of Rs." + amount);
        paymentGateway.ProcessPayment(amount);
        this.transactionId = "txn" + DateTime.Now.Ticks;
        Console.WriteLine("One-time purchase complete. Transaction ID: " + this.transactionId);
    }

    public override void IssueRefund() {
        paymentGateway.RefundPayment(transactionId, amount);
        Console.WriteLine("Initiating refund for one time payment of amount : " + amount);
    }
}
