/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaclassexample;
import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class Rectangle {
    public static double Length;
    public static double Height;
    
    public static void setLength(){
        Scanner sc = new Scanner(System.in);
        Length = sc.nextDouble();
    }
    
    public static void setHeight(){
        Scanner sc = new Scanner(System.in);
        Height = sc.nextDouble();
    }
}
