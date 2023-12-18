/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Stefani Nunes
 */


/*

//User interface
interface UserInterface{
public void modifyProfile();
}
*/

abstract class User {
    
    String username;
    String password;

    //CONSTRUCTOR
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // if the used username and password matches the users choise
    public boolean login(String userUsername, String userpassword){
        return this.username.equals(userUsername) && this.password.equals(userpassword);
    }
    
    
 
  
    
}
