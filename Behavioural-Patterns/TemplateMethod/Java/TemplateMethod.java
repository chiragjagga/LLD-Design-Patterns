import Implementations.AdminPageHandler;
import Implementations.BasePageHandler;
import Implementations.DashboardPageHandler;
import Implementations.HttpRequest;
import Implementations.HttpResponse;

public class TemplateMethod {
    public static void main(String[] args) {
        BasePageHandler dashboardHandler = new DashboardPageHandler();
        BasePageHandler adminPageHandler = new AdminPageHandler();

        // Access public page
        HttpRequest dashboardRequest = new HttpRequest();
        HttpResponse dashboardResponse = new HttpResponse();
        dashboardHandler.handleRequest(dashboardRequest, dashboardResponse);
        System.out.println("\nFinal Response:\n" + dashboardResponse);

        // Non admin login on admin page
        HttpRequest badAdminRequest = new HttpRequest();
        badAdminRequest.addHeader("X-Auth-Role", "USER"); // Not an admin
        HttpResponse badAdminResponse = new HttpResponse();
        adminPageHandler.handleRequest(badAdminRequest, badAdminResponse);
        System.out.println("\nFinal Response:\n" + badAdminResponse);

        // Access admin page
        HttpRequest goodAdminRequest = new HttpRequest();
        goodAdminRequest.addHeader("X-Auth-Role", "ADMIN"); // Is an admin
        HttpResponse goodAdminResponse = new HttpResponse();
        adminPageHandler.handleRequest(goodAdminRequest, goodAdminResponse);
        System.out.println("\nFinal Response:\n" + goodAdminResponse);
    }
}
