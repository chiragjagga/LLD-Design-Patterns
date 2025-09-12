package Abstraction;

import Implementation.IPaymentGateway;

public abstract class Payment {
    protected IPaymentGateway paymentGateway;

    public Payment(IPaymentGateway gateway){
        paymentGateway = gateway;
    }

    public abstract void makePayment();
    public abstract void issueRefund();
}
