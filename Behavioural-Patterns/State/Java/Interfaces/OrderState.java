package Interfaces;

import Implementations.Order;

public interface OrderState {
    
    default void pay(Order order){
        System.out.println("ERROR: Payment is not a valid action in the " + this.getClass().getSimpleName() + " state.");
    }

    default void confirmPayment(Order order) {
        System.out.println("ERROR: Confirming payment is not a valid action in the " + this.getClass().getSimpleName() + " state.");
    }

    default void ship(Order order) {
        System.out.println("ERROR: Shipping is not a valid action in the " + this.getClass().getSimpleName() + " state.");
    }

    default void deliver(Order order) {
        System.out.println("ERROR: Delivering is not a valid action in the " + this.getClass().getSimpleName() + " state.");
    }

    default void cancel(Order order) {
        System.out.println("ERROR: Cancelling is not a valid action in the " + this.getClass().getSimpleName() + " state.");
    }
}
