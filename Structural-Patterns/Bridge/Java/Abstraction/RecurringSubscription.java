package Abstraction;

import Implementation.IPaymentGateway;

public class RecurringSubscription extends Payment {

    private double monthlyFee;
    private String lastTransactionId;

    public RecurringSubscription(IPaymentGateway gateway, double amount){
        super(gateway);
        this.monthlyFee = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Initiating a recurring subscription of Rs." + monthlyFee);
        paymentGateway.processPayment(monthlyFee);
        this.lastTransactionId = "txn" + System.currentTimeMillis();
        System.out.println("Recurring purchase complete. Transaction ID: " + this.lastTransactionId);
    }

    @Override
    public void issueRefund() {
        paymentGateway.refundPayment(lastTransactionId, monthlyFee);
        System.out.println("Initiating refund for last recurring payment of amount : " + monthlyFee);
    }
}
