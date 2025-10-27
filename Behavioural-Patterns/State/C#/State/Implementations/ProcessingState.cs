public class ProcessingState : OrderState {

    public void ship(Order order) {
        Console.WriteLine("Order has been shipped from the warehouse.");
        order.setState(new ShippedState());
        order.printStatus();
    }

    public void cancel(Order order) {
        Console.WriteLine("Cancelling a processing order. A restocking fee may apply.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
