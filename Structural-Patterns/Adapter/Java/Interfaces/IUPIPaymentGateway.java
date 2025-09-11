package Interfaces;

import Implementations.PaymentStatus;
import Implementations.UPIPaymentRequest;
import Implementations.UPIPaymentResponse;

public interface IUPIPaymentGateway {
    UPIPaymentResponse initiatePayment(UPIPaymentRequest request);
    PaymentStatus checkStatus(String transactionId);
}