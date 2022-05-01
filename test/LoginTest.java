/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ohiob
 */
public class LoginTest {
    
    public LoginTest() {
       Login obj;
    }
    
    @BeforeEach
    public void setUp() {
        Login obj = new Login();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        int x=3,res;
        res=obj.square(x);
        assertEquals(9,res);
        
    }

    private static class obj {

        private static int square(int x) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public obj() {
        }
    }
    
}
