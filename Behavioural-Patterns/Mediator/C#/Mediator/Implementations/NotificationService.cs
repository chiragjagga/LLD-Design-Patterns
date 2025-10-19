public class NotificationService : Subscriber {

    public void onEvent(Object ev) {
        if (ev is UserLoggedInEvent) {
            UserLoggedInEvent loginEvent = (UserLoggedInEvent) ev;
           Console.WriteLine("   [NotificationService] Sent push notification: Welcome back, " + loginEvent.username + "!");
        }
    }

    public String getName() {
        return "NotificationService";
    }
    
}
