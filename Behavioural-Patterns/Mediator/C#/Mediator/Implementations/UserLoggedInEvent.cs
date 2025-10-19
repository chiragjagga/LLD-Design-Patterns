public class UserLoggedInEvent {
    public readonly String username;
    public readonly DateTime timeStamp;

    public UserLoggedInEvent(String username){
        this.username = username;
        this.timeStamp = DateTime.Now;
    }
}
