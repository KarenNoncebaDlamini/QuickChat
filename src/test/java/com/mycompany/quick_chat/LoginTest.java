/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quick_chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {

    @Test
    public void testUsername() {
        Login login = new Login()
        assertEqual(login.userLogin);
    }

    @Test
    public void userLogin() {
        Login login = new Login();
        assertEqual(login.userLogin);
    }

    @Test
    public void testCheckPassword() {
        Login login = new Login();
        assertEqual(login.checkPassword(""));
    }

    @Test
    public void testCheckCellnumber() {
        Login login = new Login();
        assertTrue(login.checkCellnumber(""));
    }
}
