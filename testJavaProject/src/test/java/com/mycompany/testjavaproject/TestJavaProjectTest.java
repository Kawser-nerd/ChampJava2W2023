/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testjavaproject;

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
public class TestJavaProjectTest {
    
    public TestJavaProjectTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
  
    /**
     * Test of main method, of class TestJavaProject.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestJavaProject.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    // we create three variables
    
    int x=2, y=2, z=3;
    
    // We are going to write a test method which will 
    //assert that x and y are equals
    
    @Test
    public void test1(){
        // if we want to see whether two values are equal
        // we need to use assertEquals
        assertEquals(x, y);// This one will generate yes
        //assertEquals(x,z);// this will return false
    }
    
    @Test
    public void test2(){
        int expected = 6;
        int actual = TestJavaProject.getMultiplication(2, 3);
        // we are going to perform assertEquals to check whether the
        // expected and actual is same or not
        assertEquals(expected, actual);
    }
    
}
