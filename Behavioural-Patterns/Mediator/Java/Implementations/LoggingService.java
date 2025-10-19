package Implementations;

import Interfaces.Subscriber;

public class LoggingService implements Subscriber {

    @Override
    public void onEvent(Object event) {
        if (event instanceof UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) event;
            System.out.println("   [LoggingService] Logged event: User '" + loginEvent.username + "' logged in at " + loginEvent.timeStamp);
        }
    }

    @Override
    public String getName() {
        return "LoggingService";
    }
    
}
