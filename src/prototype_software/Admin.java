/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Stefani Nunes
 */

public class Admin extends User implements UserInterface{

    String name;
    String surname;
   
    //CONSTRUCTOR

    public Admin(String name, String surname, String username, String password) {
        super(username, password);
        this.name = name;
        this.surname = surname;
    }

    @Override
    //to modify their own profile
    public void modifyProfile(){
         
        
    }
    @Override
    // Check if username and password matches to the admin input
    public boolean login(String userUsername, String userpassword){
        return this.username.equals(userUsername) && this.password.equals(userpassword);
    }
    
  //METHODS DECLARATIONS  
    //to access a list of all users
    public void accessUsers(){
        
    }
    //to remove other users from the system (List)
    public void removeUsers(User user){
        
    }
    //to review operations performed by others users
    public void reviewOperations(){
        
    }
}
