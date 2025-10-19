public class AuthenticationService {
    private readonly EventMediator eventBus;
    
    public AuthenticationService(EventMediator mediator){
        this.eventBus = mediator;
    }

    public void login(String username, String password){
       Console.WriteLine("AuthService: User '" + username + "' is attempting to log in.");
        
        UserLoggedInEvent ev = new UserLoggedInEvent(username);
        eventBus.publish(ev);
    }
}
