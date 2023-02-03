/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review;

/**
 *
 * @author knafi
 */
public class substraction {
    private double value1;
    private double value2;
    
    // mutators
    
    public void setValue1(double value1){
        this.value1 = value1;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    // accesors
    
    private double getValue1()
    {
        return this.value1;
    }
    
    private double getValue2(){
        return this.value2;
    }
    
    public double getSubstract(){
        return this.getValue1() - this.getValue2();
    }
    
}
