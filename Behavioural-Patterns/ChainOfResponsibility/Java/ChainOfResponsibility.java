import Implementations.ApplicationHandler;
import Implementations.AuthenticationHandler;
import Implementations.AuthorizationHandler;
import Implementations.LoggingHandler;
import Implementations.Request;
import Interfaces.IRequestHandler;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        IRequestHandler loggingHandler = new LoggingHandler();
        IRequestHandler authentication = new AuthenticationHandler();
        IRequestHandler authorization = new AuthorizationHandler();
        IRequestHandler appHandler = new ApplicationHandler();

        loggingHandler.setNext(authentication).setNext(authorization).setNext(appHandler);

        
        System.out.println("--- Scenario 1: Valid Admin Request ---");
        Request adminRequest = new Request("Fetch user data");
        adminRequest.addHeader("Authorization", "valid-token");
        adminRequest.addHeader("role", "admin");
        loggingHandler.handle(adminRequest);

        System.out.println("\n--- Scenario 2: Unauthenticated Request ---");
        Request badAuthRequest = new Request("Attempt to delete database");
        badAuthRequest.addHeader("Authorization", "invalid-token");
        loggingHandler.handle(badAuthRequest);

        System.out.println("\n--- Scenario 3: Unauthorized Request (Logged in but not an admin) ---");
        Request userRequest = new Request("Attempt to access admin panel");
        userRequest.addHeader("Authorization", "valid-token");
        userRequest.addHeader("role", "user");
        loggingHandler.handle(userRequest);
    }
}
