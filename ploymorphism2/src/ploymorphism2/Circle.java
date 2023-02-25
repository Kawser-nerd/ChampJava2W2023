/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ploymorphism2;

/**
 *
 * @author knafi
 */
public class Circle extends Shape{
    private int radius;
    
    @Override
    public void whereAmI(){
        System.out.println("We are in Circle Class");
    }
    // this mehtod is overload the superclass methods
    public void setArea(int r){
        this.radius = r;
    }
    public double getArea1(){
        return (double) (3.1416 * this.radius * this.radius); 
    }

    @Override
    public void setArea(int L, int H) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
