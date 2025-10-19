package Implementations;

import Interfaces.EventMediator;

public class AuthenticationService {
    private final EventMediator eventBus;
    
    public AuthenticationService(EventMediator mediator){
        this.eventBus = mediator;
    }

    public void login(String username, String password){
        System.out.println("AuthService: User '" + username + "' is attempting to log in.");
        
        UserLoggedInEvent event = new UserLoggedInEvent(username);
        eventBus.publish(event);
    }
}
