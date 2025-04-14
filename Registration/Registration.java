/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class Registration {
    private Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
     System.out.print("Enter FirsT Name: ");
     String firstName = scanner.nextLine();
     
     System.out.print("Enter Last Name: ");
     String lastName = scanner.nextLine();
     
     System.out.print("Enter Username(must contain underscore and be 5 character or less): ");
     String UserName = scanner.nextLine();
     
     System.out.print("Enter Password(at least 8 characters , must contain Capital letter, number, special character): ");
     String password = scanner.nextLine();
     
     System.out.print("Enter Number (with international code, max 10 characters, e.g., +27815412733");
     String cellNumber = scanner.nextLine();
     
     return new Login (firstName, lastName, UserName, password, cellNumber);
   
    } 
    public void greetUser(){
        System.out.println("Welcome " + user.getFirstName()+ user.getLastName()+ "!");
    }
}
