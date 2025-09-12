public abstract class Payment {
    protected IPaymentGateway paymentGateway;

    public Payment(IPaymentGateway gateway){
        paymentGateway = gateway;
    }

    public abstract void MakePayment();
    public abstract void IssueRefund();
}
