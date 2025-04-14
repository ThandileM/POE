/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Attributes
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellNumber;
    
    //Constructor
    public Login(String firstName, String lastName, String username, String password, String cellNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
    }
    
   //Getter method 
    public String getFirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getUsername(){
    return username;
    }
    public String getPassword(){
        return password;
    }
    public String getCellNumber(){
        return cellNumber;
    }
    
   //Setter method
    public void setUsername(String username){
        this.username = username;
    }
    
    //Check if username is valid
    public boolean checkUsername(){
        return username.contains("_")&& username.length()<=5;
    }
    
    //Check password complexity
    public static boolean checkPasswordComplexity(String password){
        return password.length()>= 8 &&
               password.matches(".[A-Z].*")&&
               password.matches(".*[0-9].*")&&
               password.matches(".*[!@#$%^&*()].*");
    }
    
    //Check Cell phone numner format
    public boolean checkCellPhoneNumber(){
        return cellNumber.startsWith("+")&& cellNumber.length()<=10;
    }    
    //Register a user 
   
    public String displayFullName(){
        System.out.println("Welcome" + firstName + "" + lastName + "It is great to see you again.");
        
        if(checkUsername()){
            System.out.println("Username succesfully captured.");
        }else {
            System.out.println("Username is not correctly formatted; please ensure that the passward contains an underscore and is no more that five characters in length.");
        }
        if(checkPasswordComplexity(password)){
            System.out.println("Password successfuly captured.");
        }else{
            System.out.println("Password is not correctlty formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        if(checkCellPhoneNumber()){
            System.out.println("Cell phone number successfull added.");
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
        return "User has been registered successfully.";
      }
    //login status
    public String returnLoginStatus (boolean loginResult){
        return loginResult ? "Successful login" : "Failed login";
    }
}

    

    