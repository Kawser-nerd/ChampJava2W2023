/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacing;

/**
 *
 * @author knafi
 */
public class Incrementing implements testInterface1 {
    public int getIncrementedNumber(){
        for(int i = value; i < 10 ; i++){
            //continue;
        }
        return value;
    }
    
    public void print1(){
        System.out.println(value1);
    }
    
    public void print2(){
        System.out.println(value1);
    }
    
}
