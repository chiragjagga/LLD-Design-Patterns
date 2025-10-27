package Implementations;

import Interfaces.OrderState;

public class ShippedState implements OrderState {
    @Override
    public void deliver(Order order) {
        System.out.println("Order has been delivered to the customer.");
        order.setState(new DeliveredState());
        order.printStatus();
    }
}
