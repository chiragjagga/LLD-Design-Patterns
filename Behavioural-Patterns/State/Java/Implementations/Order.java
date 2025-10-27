package Implementations;

import Interfaces.OrderState;

public class Order {
    private OrderState currentState;

    public Order(){
        this.currentState = new NewState();
        System.out.println("A new order has been created.");
        printStatus();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void printStatus() {
        System.out.println("ORDER STATUS: " + currentState.getClass().getSimpleName());
    }

    public void pay() {
        currentState.pay(this);
    }

    public void confirmPayment() {
        currentState.confirmPayment(this);
    }
    
    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

}
