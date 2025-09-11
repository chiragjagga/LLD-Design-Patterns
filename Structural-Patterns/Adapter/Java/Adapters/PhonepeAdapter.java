package Adapters;

import Adaptee.PhonepeAPI;
import Implementations.PaymentStatus;
import Implementations.UPIPaymentRequest;
import Implementations.UPIPaymentResponse;
import Interfaces.IUPIPaymentGateway;

public class PhonepeAdapter implements IUPIPaymentGateway{

    private final PhonepeAPI phonepeAPI = new PhonepeAPI();

    @Override
    public UPIPaymentResponse initiatePayment(UPIPaymentRequest request) {
        System.out.println("--> Using PhonePeAdapter to translate our request...");

        String transactionId = phonepeAPI.createTransaction(request.getOrderId());
        return new UPIPaymentResponse(transactionId, PaymentStatus.PENDING);
    }

    @Override
    public PaymentStatus checkStatus(String transactionId) {
        int status = phonepeAPI.fetchStatus(transactionId);
        
        return (status == 200) ? PaymentStatus.SUCCESS : PaymentStatus.FAILED;
    }
    
}
