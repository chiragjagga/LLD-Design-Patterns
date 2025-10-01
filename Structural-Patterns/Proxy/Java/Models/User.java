package Models;

public class User {
    private String name;
    private Enums.Role role;

    public User(String name, Enums.Role role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public Enums.Role getRole(){
        return role;
    }
}
