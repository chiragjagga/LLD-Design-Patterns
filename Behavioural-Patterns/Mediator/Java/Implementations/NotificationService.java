package Implementations;

import Interfaces.Subscriber;

public class NotificationService implements Subscriber {

    @Override
    public void onEvent(Object event) {
        if (event instanceof UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) event;
            System.out.println("   [NotificationService] Sent push notification: Welcome back, " + loginEvent.username + "!");
        }
    }

    @Override
    public String getName() {
        return "NotificationService";
    }
    
}
