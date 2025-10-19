public class LoggingService : Subscriber {

    public void onEvent(Object ev) {
        if (ev is UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) ev;
           Console.WriteLine("   [LoggingService] Logged event: User '" + loginEvent.username + "' logged in at " + loginEvent.timeStamp);
        }
    }

    public String getName() {
        return "LoggingService";
    }
    
}
