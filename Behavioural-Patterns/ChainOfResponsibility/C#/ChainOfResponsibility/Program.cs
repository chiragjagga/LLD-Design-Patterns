        IRequestHandler loggingHandler = new LoggingHandler();
        IRequestHandler authentication = new AuthenticationHandler();
        IRequestHandler authorization = new AuthorizationHandler();
        IRequestHandler appHandler = new ApplicationHandler();

        loggingHandler.SetNext(authentication).SetNext(authorization).SetNext(appHandler);

        
        Console.WriteLine("--- Scenario 1: Valid Admin Request ---");
        Request adminRequest = new Request("Fetch user data");
        adminRequest.addHeader("Authorization", "valid-token");
        adminRequest.addHeader("role", "admin");
        loggingHandler.Handle(adminRequest);

        Console.WriteLine("\n--- Scenario 2: Unauthenticated Request ---");
        Request badAuthRequest = new Request("Attempt to delete database");
        badAuthRequest.addHeader("Authorization", "invalid-token");
        loggingHandler.Handle(badAuthRequest);

        Console.WriteLine("\n--- Scenario 3: Unauthorized Request (Logged in but not an admin) ---");
        Request userRequest = new Request("Attempt to access admin panel");
        userRequest.addHeader("Authorization", "valid-token");
        userRequest.addHeader("role", "user");
        loggingHandler.Handle(userRequest);