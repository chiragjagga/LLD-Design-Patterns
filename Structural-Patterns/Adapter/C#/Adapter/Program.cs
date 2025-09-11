// See https://aka.ms/new-console-template for more information

IUPIPaymentGateway paymentGateway = new PhonepeAdapter();
UPIPaymentResponse res = paymentGateway.InitiatePayment(new UPIPaymentRequest("123", 100, "test@ybl"));
String status = paymentGateway.CheckStatus(res.GetTransactionId()).ToString();
Console.WriteLine("Transaction using PhonePe status : " + status);

paymentGateway = new GPayAdapter();
res = paymentGateway.InitiatePayment(new UPIPaymentRequest("111", 200, "test@okhdfc"));
status = paymentGateway.CheckStatus(res.GetTransactionId()).ToString();
Console.WriteLine("Transaction using GPay status : " + status);