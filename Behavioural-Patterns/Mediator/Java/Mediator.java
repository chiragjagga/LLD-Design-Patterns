import Implementations.ApplicationEventBus;
import Implementations.AuthenticationService;
import Implementations.CacheService;
import Implementations.LoggingService;
import Implementations.NotificationService;
import Implementations.UserLoggedInEvent;
import Interfaces.EventMediator;
import Interfaces.Subscriber;

public class Mediator{
    public static void main(String[] args) {
        EventMediator eventBus = new ApplicationEventBus();

        AuthenticationService authService = new AuthenticationService(eventBus);
        Subscriber loggingService = new LoggingService();
        Subscriber notificationService = new NotificationService();
        Subscriber cacheService = new CacheService();

        eventBus.subscribe(loggingService, UserLoggedInEvent.class);
        eventBus.subscribe(notificationService, UserLoggedInEvent.class);

        authService.login("admin_user", "password123");

        System.out.println("\n--- Adding a new Cache service dynamically ---");
        eventBus.subscribe(cacheService, UserLoggedInEvent.class);
        authService.login("guest_user", "guest");
    }
}