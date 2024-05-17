/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automatedunittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }

    @Test
    public void testAddition() {
        
      UnitTesting test = new UnitTesting();
      
      int expected = 4;
      int actual = test.addition(1, 3);
      
      assertEquals(expected, actual);
        
    }
    
    @Test
    public void testSubtraction() {
        
      UnitTesting test = new UnitTesting();
      
      int expected = 6;
      int actual = test.subtraction(10, 4);
      
      assertEquals(expected, actual);
        
    }
    
    @Test
    public void testMessage(){
      UnitTesting test = new UnitTesting();
      
      String actual = test.getMessage();
      
      String expected = "Hello, I See You!";
      
      assertEquals(expected, actual);
        
    }
    
}
