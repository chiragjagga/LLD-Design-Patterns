        EventMediator eventBus = new ApplicationEventBus();

        AuthenticationService authService = new AuthenticationService(eventBus);
        Subscriber loggingService = new LoggingService();
        Subscriber notificationService = new NotificationService();
        Subscriber cacheService = new CacheService();

        eventBus.subscribe(loggingService, typeof(UserLoggedInEvent));
        eventBus.subscribe(notificationService, typeof(UserLoggedInEvent));

        authService.login("admin_user", "password123");

       Console.WriteLine("\n--- Adding a new Cache service dynamically ---");
        eventBus.subscribe(cacheService, typeof(UserLoggedInEvent));
        authService.login("guest_user", "guest");
