public interface OrderState {
    
    void pay(Order order){
        Console.WriteLine("ERROR: Payment is not a valid action in the " + this.GetType().Name + " state.");
    }

    void confirmPayment(Order order) {
        Console.WriteLine("ERROR: Confirming payment is not a valid action in the " + this.GetType().Name + " state.");
    }

    void ship(Order order) {
        Console.WriteLine("ERROR: Shipping is not a valid action in the " + this.GetType().Name + " state.");
    }

    void deliver(Order order) {
        Console.WriteLine("ERROR: Delivering is not a valid action in the " + this.GetType().Name + " state.");
    }

    void cancel(Order order) {
        Console.WriteLine("ERROR: Cancelling is not a valid action in the " + this.GetType().Name + " state.");
    }
}
