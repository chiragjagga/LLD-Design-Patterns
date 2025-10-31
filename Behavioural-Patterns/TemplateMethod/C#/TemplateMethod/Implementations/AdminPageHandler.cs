public class AdminPageHandler : BasePageHandler {
    protected override bool authorize(HttpRequest request){
        Console.WriteLine("Step 3: Running CUSTOM authorization for Admin Page...");
        String role = request.getHeaders()["X-Auth-Role"];
        bool isAdmin = "ADMIN".Equals(role);
        if (!isAdmin) {
            Console.WriteLine("Access Denied: User role is not ADMIN.");
        }
        return isAdmin;
    }

    protected override void renderPage(HttpRequest request, HttpResponse response) {
        Console.WriteLine("Step 4: Rendering the Admin Control Panel...");
        response.setStatusCode(200);
        response.setBody("<html><body><h1>Admin Control Panel</h1><p>System is stable.</p></body></html>");
    }
    
}
