// See https://aka.ms/new-console-template for more information
        Console.WriteLine("Using UPI Payment for one-time payment");
        IPaymentGateway paymentGateway = new UPIGateway();

        Payment oneTime = new OneTimePayment(paymentGateway, 100);
        oneTime.MakePayment();
        oneTime.IssueRefund();

        Console.WriteLine("Using Card Payment for recurring subscription");
        paymentGateway = new CardGateway();
        Payment subcription = new RecurringSubscription(paymentGateway, 99);
        subcription.MakePayment();
        subcription.IssueRefund();

        Console.WriteLine("Using UPI Payment for same subscription");
        paymentGateway = new UPIGateway();
        subcription = new RecurringSubscription(paymentGateway, 99);
        subcription.MakePayment();