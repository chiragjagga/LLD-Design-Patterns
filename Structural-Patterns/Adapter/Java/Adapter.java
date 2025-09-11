import Adapters.GPayAdapter;
import Adapters.PhonepeAdapter;
import Implementations.UPIPaymentRequest;
import Implementations.UPIPaymentResponse;
import Interfaces.IUPIPaymentGateway;

public class Adapter {
    public static void main(String[] args) {
        IUPIPaymentGateway paymentGateway = new PhonepeAdapter();

        UPIPaymentResponse res = paymentGateway.initiatePayment(new UPIPaymentRequest("123", 100, "test@ybl"));
        String status = paymentGateway.checkStatus(res.getTransactionId()).toString();
        System.out.println("Transaction using PhonePe status : " + status);

        paymentGateway = new GPayAdapter();
        res = paymentGateway.initiatePayment(new UPIPaymentRequest("111", 200, "test@okhdfc"));
        status = paymentGateway.checkStatus(res.getTransactionId()).toString();
        System.out.println("Transaction using GPay status : " + status);
    }
}
