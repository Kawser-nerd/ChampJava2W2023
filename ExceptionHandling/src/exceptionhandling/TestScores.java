/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author knafi
 */
public class TestScores {
    int []a;
    double temp = 0;
    
    TestScores(int [] scores){
        this.a = scores;
    }
    
    public double getAverage() throws ArrayIndexOutOfBoundsException{
        for(int i = 0; i< this.a.length; i++){
            if(a[i]<0 || a[i]>100)
                throw new IllegalArgumentException("Input the parameter inbetween 0 and 100");
            else
                temp+=a[i];
        }
        return temp/a.length;
    }
}
