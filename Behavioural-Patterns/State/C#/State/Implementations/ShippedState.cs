public class ShippedState : OrderState {
    public void deliver(Order order) {
        Console.WriteLine("Order has been delivered to the customer.");
        order.setState(new DeliveredState());
        order.printStatus();
    }
}
