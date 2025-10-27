package Implementations;

import Interfaces.OrderState;

public class NewState implements OrderState {
    
    @Override
    public void pay(Order order){
        System.out.println("Payment initiated. Moving order to PendingPayment.");
        order.setState(new PendingPaymentState());
        order.printStatus();
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled by user.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
