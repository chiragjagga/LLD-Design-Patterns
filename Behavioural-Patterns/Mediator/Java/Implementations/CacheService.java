package Implementations;

import Interfaces.Subscriber;

public class CacheService implements Subscriber{

    @Override
    public void onEvent(Object event) {
        if (event instanceof UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) event;
            System.out.println("   [CacheService] Invalidating cache for user: " + loginEvent.username);
        }
    }

    @Override
    public String getName() {
        return "CacheService";
    }
    
}
