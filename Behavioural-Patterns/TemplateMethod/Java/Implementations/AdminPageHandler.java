package Implementations;

public class AdminPageHandler extends BasePageHandler {

    @Override
    protected boolean authorize(HttpRequest request){
        System.out.println("Step 3: Running CUSTOM authorization for Admin Page...");
        String role = request.getHeaders().get("X-Auth-Role");
        boolean isAdmin = "ADMIN".equals(role);
        if (!isAdmin) {
            System.out.println("Access Denied: User role is not ADMIN.");
        }
        return isAdmin;
    }

    @Override
    protected void renderPage(HttpRequest request, HttpResponse response) {
        System.out.println("Step 4: Rendering the Admin Control Panel...");
        response.setStatusCode(200);
        response.setBody("<html><body><h1>Admin Control Panel</h1><p>System is stable.</p></body></html>");
    }
    
}
