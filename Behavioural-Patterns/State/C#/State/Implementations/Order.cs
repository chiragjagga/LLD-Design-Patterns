public class Order {
    private OrderState currentState;

    public Order(){
        this.currentState = new NewState();
        Console.WriteLine("A new order has been created.");
        printStatus();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void printStatus() {
        Console.WriteLine("ORDER STATUS: " + currentState.GetType().Name);
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
