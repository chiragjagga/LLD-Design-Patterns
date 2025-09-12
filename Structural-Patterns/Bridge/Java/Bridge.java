import Abstraction.OneTimePayment;
import Abstraction.Payment;
import Abstraction.RecurringSubscription;
import Implementation.CardGateway;
import Implementation.IPaymentGateway;
import Implementation.UPIGateway;

public class Bridge {
    public static void main(String[] args) {
        System.out.println("Using UPI Payment for one-time payment");
        IPaymentGateway paymentGateway = new UPIGateway();

        Payment oneTime = new OneTimePayment(paymentGateway, 100);
        oneTime.makePayment();
        oneTime.issueRefund();

        System.out.println("Using Card Payment for recurring subscription");
        paymentGateway = new CardGateway();
        Payment subcription = new RecurringSubscription(paymentGateway, 99);
        subcription.makePayment();
        subcription.issueRefund();

        System.out.println("Using UPI Payment for same subscription");
        paymentGateway = new UPIGateway();
        subcription = new RecurringSubscription(paymentGateway, 99);
        subcription.makePayment();
    }
}