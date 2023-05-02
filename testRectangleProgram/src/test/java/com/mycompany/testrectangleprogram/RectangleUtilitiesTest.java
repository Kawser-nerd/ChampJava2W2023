/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testrectangleprogram;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author knafi
 */
public class RectangleUtilitiesTest {
    
    public RectangleUtilitiesTest() {
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
     * Test of main method, of class RectangleUtilities.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RectangleUtilities.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class RectangleUtilities.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        double width = 2;
        double height = 4;
        double expResult = 8;
        double result = RectangleUtilities.getArea(width, height);
        // asserEquals() method will only check whether the 
        // resulted value and the expected values are similar or not
        // if not, it will generate test fail message.
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPerimeter method, of class RectangleUtilities.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        double width = 2;
        double height = 4;
        double expResult = 12;
        double result = RectangleUtilities.getPerimeter(width, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    int x=2, y = 2, z = 3;
    @Test
    public void assertEqualsTest(){
        // we are going to learn some of the test method, specially from 
        // assertion class and will see how they work
        // assetEquals() method see whether the given value and the expected
        // values are similar or not
        
        assertEquals(x, y); // x and y are two similar values, 
        // so the test will be passed
        
    }
    
    @Test
    public void assertNotEqualsTest(){
        // assertNotEquals passes the tests when two values, expected and the resulted
        // are not similar
        
        assertNotEquals(y, z);
    }
    
    // Now the boolean values , how to check/work with boolean return values
    
    boolean t = true;
    boolean f = false;
    
    // assertTrue method: this method only check whether the values returning
    // by the program is true or not, if not, fails the test
    @Test
    public void assertTrueTest(){
        assertTrue(t);
    }
    
    // assertFalse works as opposite to assertTrue. It passes the tests only
    // if the resulting values are false
    
    @Test
    public void assertFalseTest(){
        assertFalse(5>6);
    }
    
}
