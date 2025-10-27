package Implementations;

import Interfaces.OrderState;

public class PendingPaymentState implements OrderState {
    @Override
    public void confirmPayment(Order order) {
        System.out.println("Payment confirmed. Moving order to Processing.");
        order.setState(new ProcessingState());
        order.printStatus();
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Payment failed or was cancelled. Order is now cancelled.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
