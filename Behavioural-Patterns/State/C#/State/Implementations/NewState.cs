public class NewState : OrderState {
    
    public void pay(Order order){
        Console.WriteLine("Payment initiated. Moving order to PendingPayment.");
        order.setState(new PendingPaymentState());
        order.printStatus();
    }

    public void cancel(Order order) {
        Console.WriteLine("Order cancelled by user.");
        order.setState(new CancelledState());
        order.printStatus();
    }
}
