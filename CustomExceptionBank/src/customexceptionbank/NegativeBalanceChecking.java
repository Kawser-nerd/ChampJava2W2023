/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customexceptionbank;

/**
 *
 * @author knafi
 */
public class NegativeBalanceChecking extends Exception {
    public NegativeBalanceChecking(){
        super("Error: No Balance Provided");
    }
    public NegativeBalanceChecking(double balance){
        super("Error: Negative Balance Provided: "+ balance);
    }
}
