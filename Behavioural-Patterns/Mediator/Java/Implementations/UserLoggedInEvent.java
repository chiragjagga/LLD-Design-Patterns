package Implementations;

import java.time.LocalDateTime;

public class UserLoggedInEvent {
    public final String username;
    public final LocalDateTime timeStamp;

    public UserLoggedInEvent(String username){
        this.username = username;
        this.timeStamp = LocalDateTime.now();
    }
}
