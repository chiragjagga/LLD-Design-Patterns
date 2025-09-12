package Abstraction;

import Implementation.IPaymentGateway;

public class OneTimePayment extends Payment {

    private double amount;
    private String transactionId;

    public OneTimePayment(IPaymentGateway gateway, double amount){
        super(gateway);
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Initiating a one-time purchase of Rs." + amount);
        paymentGateway.processPayment(amount);
        this.transactionId = "txn" + System.currentTimeMillis();
        System.out.println("One-time purchase complete. Transaction ID: " + this.transactionId);
    }

    @Override
    public void issueRefund() {
        paymentGateway.refundPayment(transactionId, amount);
        System.out.println("Initiating refund for one time payment of amount : " + amount);
    }
}
