public class DashboardPageHandler : BasePageHandler {

    protected override void renderPage(HttpRequest request, HttpResponse response) {
        Console.WriteLine("Step 4: Rendering the Dashboard Page...");
        response.setStatusCode(200);
        response.setBody("<html><body><h1>Welcome to your Dashboard!</h1></body></html>");
    }
    
}
