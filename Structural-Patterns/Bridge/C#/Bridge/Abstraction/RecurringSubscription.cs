public class RecurringSubscription : Payment {

    private double monthlyFee;
    private String lastTransactionId = "";

    public RecurringSubscription(IPaymentGateway gateway, double amount) : base(gateway){
        this.monthlyFee = amount;
    }

    public override void MakePayment() {
        Console.WriteLine("Initiating a recurring subscription of Rs." + monthlyFee);
        paymentGateway.ProcessPayment(monthlyFee);
        this.lastTransactionId = "txn" + DateTime.Now.Ticks;
        Console.WriteLine("Recurring purchase complete. Transaction ID: " + this.lastTransactionId);
    }

    public override void IssueRefund() {
        paymentGateway.RefundPayment(lastTransactionId, monthlyFee);
        Console.WriteLine("Initiating refund for last recurring payment of amount : " + monthlyFee);
    }
}
