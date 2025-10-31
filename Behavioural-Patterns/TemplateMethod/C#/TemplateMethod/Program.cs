        BasePageHandler dashboardHandler = new DashboardPageHandler();
        BasePageHandler adminPageHandler = new AdminPageHandler();

        // Access public page
        HttpRequest dashboardRequest = new HttpRequest();
        HttpResponse dashboardResponse = new HttpResponse();
        dashboardHandler.handleRequest(dashboardRequest, dashboardResponse);
        Console.WriteLine("\nFinal Response:\n" + dashboardResponse);

        // Non admin login on admin page
        HttpRequest badAdminRequest = new HttpRequest();
        badAdminRequest.addHeader("X-Auth-Role", "USER"); // Not an admin
        HttpResponse badAdminResponse = new HttpResponse();
        adminPageHandler.handleRequest(badAdminRequest, badAdminResponse);
        Console.WriteLine("\nFinal Response:\n" + badAdminResponse);

        // Access admin page
        HttpRequest goodAdminRequest = new HttpRequest();
        goodAdminRequest.addHeader("X-Auth-Role", "ADMIN"); // Is an admin
        HttpResponse goodAdminResponse = new HttpResponse();
        adminPageHandler.handleRequest(goodAdminRequest, goodAdminResponse);
        Console.WriteLine("\nFinal Response:\n" + goodAdminResponse);