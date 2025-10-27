        // successful order
        Order order1 = new Order();

        order1.pay();
        order1.ship();
        order1.confirmPayment();
        order1.ship();
        order1.cancel();
        order1.deliver();

        // cancelled order
        Order order2 = new Order();
        
        order2.confirmPayment();
        order2.cancel();
        order2.ship();
