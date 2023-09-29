package models;

public class Users {
    private String username;
    private String password;
    private int userType;
    
    public Users (String username, String password, int userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public int userType() {
        return this.userType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
