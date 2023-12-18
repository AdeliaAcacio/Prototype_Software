/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prototype_software;

/**
 * This UserInterface has a collection of methods that can be implemented by any class
 * When the class implements an interface UserInterface, it must provide an implementation for all the methods declared in the interface
 * 
 * @author Adelia Acacio
 */



public interface UserInterface {
    //This method can be called from another class
    void modifyProfile();
    
    /*Functional interface that returns an array of User objects
    public User[] listUser();
    
    
   
    // The declaration method 'modifyProfile' can be accessed from the same package as the class that conits the method, because this method has a 'default' access modifier. 
    default void modifyProfile(){
    }
     */   
    
}


