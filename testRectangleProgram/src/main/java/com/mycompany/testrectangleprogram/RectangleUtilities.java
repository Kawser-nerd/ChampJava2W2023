/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testrectangleprogram;

/**
 *
 * @author knafi
 */
public class RectangleUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getArea(3, 6));
        System.out.println(getPerimeter(3, 6));
    }
    
    public static double getArea(double width, double height){
        return width * height;
    }
    
    public static double getPerimeter(double width, double height){
        return (width + height) * 2;// This is the error It should be plus
    }
    
    
    
}
