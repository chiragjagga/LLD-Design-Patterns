package Implementations;

import Interfaces.OrderState;

public class ProcessingState implements OrderState {
    @Override
    public void ship(Order order) {
        System.out.println("Order has been shipped from the warehouse.");
        order.setState(new ShippedState());
        order.printStatus();
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cancelling a processing order. A restocking fee may apply.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
