/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author flani
 */
public class Employee {
    
    private String username;
    private String password;
    
    public Employee(String inUsername, String inPassword) {
        setUsername(inUsername);
        setPassword(inPassword);
    }
    
    public void setUsername(String inUsername) {
        if(inUsername == null) {
            throw new IllegalArgumentException("Username can't be null");
        }
        else {
            username = inUsername;
        }
    }
    
    public void setPassword(String inPassword) {
        if(inPassword == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        else {
            password = inPassword;
        }
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String toString() {
        return (username + "," + password);
    }
}
