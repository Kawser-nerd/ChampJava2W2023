/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customexceptionbank;

/**
 *
 * @author knafi
 */
public class NegativeInterestChecking extends Exception {
    public NegativeInterestChecking(){ // no-arg constructor
        super("Error: Negative Interest Rate");
    }
    
    public NegativeInterestChecking(double rate){ // no-arg constructor
        super("Error: Negative Interest Rate: " + rate);
    }
}
