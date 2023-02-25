/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ploymorphism2;

/**
 *
 * @author knafi
 */
public class Rectangle extends Shape {
    private int Length, Height;
    // we need to override as the methods in Shape class/superclass
    // have the same name and signature
    
    @Override
    public void whereAmI(){
        System.out.println("We are in Rectangle Class");
    }
    @Override
    public void setArea(int L, int H){
        this.Length = L;
        this.Height = H;
    }
    @Override
    public int getArea(){
        return this.Length * this.Height;
    }
    
}
