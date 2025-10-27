public class PendingPaymentState : OrderState {
    public void confirmPayment(Order order) {
        Console.WriteLine("Payment confirmed. Moving order to Processing.");
        order.setState(new ProcessingState());
        order.printStatus();
    }

    public void cancel(Order order) {
        Console.WriteLine("Payment failed or was cancelled. Order is now cancelled.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
