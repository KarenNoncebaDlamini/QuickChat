/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quick_chat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsernameTrue() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }
       
        @Test
    public void testCheckUsernameFalse() {
        System.out.println("checkUsername");
        String username = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPasswordTrue() {
        System.out.println("checkPassword");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
    }
        
        @Test
    public void testCheckPasswordFalse() {
        System.out.println("checkPassword");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellnumber method, of class Login.
     */
    @Test
    public void testCheckCellnumberTrue() {
        System.out.println("checkCellnumber");
        String cellnumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellnumber(cellnumber);
        assertEquals(expResult, result);
    }
       
         @Test
    public void testCheckCellnumberFalse() {
        System.out.println("checkCellnumber");
        String cellnumber = "08966553";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellnumber(cellnumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of userRegister method, of class Login.
     */
    @Test
    public void testUserRegisterTrue() {
        System.out.println("userRegister");
        Login instance = new Login();
        instance.userRegister();
    }
      
        
      @Test
    public void testUserRegisterFalse() {
        System.out.println("userRegister");
        Login instance = new Login();
        instance.userRegister();
        
    }

    /**
     * Test of userLogin method, of class Login.
     */
    @Test
    public void testUserLoginTrue() {
        System.out.println("userLogin");
        Login instance = new Login();
        instance.userLogin();
        
    }
        
    @Test
    public void testUserLoginFalse() {
        System.out.println("userLogin");
        Login instance = new Login();
        instance.userLogin();
       
    }
    
}
