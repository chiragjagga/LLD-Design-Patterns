package Implementations;

public class DashboardPageHandler extends BasePageHandler {

    @Override
    protected void renderPage(HttpRequest request, HttpResponse response) {
        System.out.println("Step 4: Rendering the Dashboard Page...");
        response.setStatusCode(200);
        response.setBody("<html><body><h1>Welcome to your Dashboard!</h1></body></html>");
    }
    
}
