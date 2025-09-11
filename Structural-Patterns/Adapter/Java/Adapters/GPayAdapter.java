package Adapters;

import Adaptee.GPayAPI;
import Implementations.PaymentStatus;
import Implementations.UPIPaymentRequest;
import Implementations.UPIPaymentResponse;
import Interfaces.IUPIPaymentGateway;

public class GPayAdapter implements IUPIPaymentGateway{

    private final GPayAPI gPayAPI = new GPayAPI();

    @Override
    public UPIPaymentResponse initiatePayment(UPIPaymentRequest request) {
        System.out.println("--> Using GooglePayAdapter to translate our request...");
        String transactionId = gPayAPI.startPayment(request.getOrderId());

        PaymentStatus status = PaymentStatus.valueOf(gPayAPI.fetchStatus(transactionId));

        return new UPIPaymentResponse(transactionId, status);
    }

    @Override
    public PaymentStatus checkStatus(String transactionId) {
        String status = gPayAPI.fetchStatus(transactionId);
        return PaymentStatus.valueOf(status);
    }
    
}
