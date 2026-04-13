/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quick_chat;

import java.util.Scanner;
    

/**
 *
 * @author Student
 */
class Login {
    
    String Storefullname;
    String Storeusername;
    String Storepassword;
    String Storecellnumber;
    
    boolean checkUsername(String username) {
        if (username.contains("_") && username.length() == 5) {
            System.out.println("Username is successfully captured");
            return true;
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore  and is no more than five characters in length");
            return false;
        }
    }
    
    boolean checkPassword(String password) {
        if (password.length() >= 8 && password.chars().anyMatch(c -> Character.isUpperCase(c)) && password.chars().anyMatch(c -> Character.isDigit(c)) && password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Password successfuly captured");
            return true;
        } else {
            System.out.println("Password is not correctly formatted;please ensure that the password contain at least eight characters, a capital letter, a number and special character");
            return false;
        }
    }
    
    boolean checkCellnumber(String cellnumber) {
        if (cellnumber.startsWith("+27") && cellnumber.substring(3).matches("\\d{9}")) {
            System.out.println("Cellphone number sucessfully added.");
            return true;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            return false;
            
        }
    }
    
    void userRegister() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Register===");
        
        System.out.println("Enter your Name and Surname");
        String fullname = input.nextLine();
        System.out.println("Enter a Username");
        String username = input.nextLine();
        System.out.println("Enter a Password");
        String password = input.nextLine();
        System.out.println("Enter a cell phone number");
        String cellnumber = input.nextLine();
        
        Storefullname = fullname;
        Storeusername = username;
        Storepassword = password;
        Storecellnumber = cellnumber;
        
        if (checkUsername(username) && checkPassword(password) && checkCellnumber(cellnumber)) {
            System.out.println("Registration completed successfully");
        } else {
            System.out.println("Registration failed, please try again");
            
        }
        
    }
    
    void userLogin() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Login===");
        System.out.println("Enter your Username");
        String username = input.nextLine();
        System.out.println("Enter your Password");
        String password = input.nextLine();
        System.out.println("Enter your cellphone number");
        String cellnumber = input.nextLine();
        
        if (username.equals(Storeusername) && password.equals(Storepassword) && cellnumber.equals(Storecellnumber)) {
            System.out.println("Welcome<user first name>,<user last name> it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect , please try again.");
            
        }
        
    }
    
   
    }

public class Quick_Chat {

    public static void main(String[] args) {
        Scanner enterMenu = new Scanner(System.in);
        Login QuickChat = new Login();
        int choice;
        do {
            System.out.println("===MENU===");
            System.out.println("1:Register");
            System.out.println("2:Login");
            System.out.println("3:Exit");
            System.out.println("Enter Option on Menu");
            
            choice = enterMenu.nextInt();
            switch(choice){
                case 1:
                    QuickChat.userRegister();
                    break;
                case 2:
                    QuickChat.userLogin();
                    break;
                case 3:
                     System.out.println("Goodbye");
                    break;
                    
                  default:System.out.println("Invalid choice");
            }
        } while (choice != 3);
            
            enterMenu.close();
        }
    }

