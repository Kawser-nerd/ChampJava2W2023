/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle;
import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class Rectangle2 {
    private String outsideWeather;
    
    public void condition_example()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weather Condition");
        
        outsideWeather = sc.nextLine();
        
        if(outsideWeather.equals("Cold") || outsideWeather.equals("cold")){
            outsideWeather = sc.nextLine();
            if(outsideWeather.equals("Snowing"))
            {
                System.out.println("Wear Parka");
            }
            else
            {
                System.out.println("Wear Jacket");
            }
        }
        else
        {
            System.out.println("Wear Shorts");
        }
            
    }
}
