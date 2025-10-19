public class CacheService : Subscriber{

    public void onEvent(Object ev) {
        if (ev is UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) ev;
           Console.WriteLine("   [CacheService] Invalidating cache for user: " + loginEvent.username);
        }
    }

    public String getName() {
        return "CacheService";
    }
    
}
