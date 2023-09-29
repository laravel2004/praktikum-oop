/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;

/**
 *
 * @author agungdwin
 */
public class Platform {
    
    private final ArrayList<Users> users = new ArrayList<>();
    private int countUsers;
    
    public Platform() {
        this.countUsers = 0;
    }
    
    public void addUser (String username, String password, int userType) {
        this.users.add(new Users(username, password, userType));
    }
    
    public void deleteUser (int index) {
        this.users.remove(index);
    }
    
    public void updateUser (int index, String username, String password) {
        this.users.get(index).setUsername(username);
        this.users.get(index).setPassword(password);
    }
    
    public Users getUser (int index) {
        return this.users.get(index);
    }
    
    
}
