/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review;

/**
 *
 * @author knafi
 */
public class decrement {
    private double value1;
    private double value2;

    decrement(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public double getValue1(){
        return this.value1-=5;
    }
    public double getValue2(){
        return this.value2-=5;
    }
}
