/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ploymorphism2;

/**
 *
 * @author knafi
 */
public class Square extends Shape {
    private int Length;
    
    //We dont need to override as we are overloading here 
   @Override
    public void whereAmI(){
        System.out.println("We are in Square Class");
    }
    public void setArea(int L){
        this.Length = L;
    }
    //We need to override as we are using the same method signature of 
    //Superclass
    @Override
    public int getArea(){
        return this.Length * this.Length;
    }

    @Override
    public void setArea(int L, int H) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        System.out.println("We dont need this methoid");
    }
    
  
    
}
