/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customexceptionbank;

import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class CustomExceptionBank{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NegativeBalanceChecking, 
            NegativeInterestChecking {
        // TODO code application logic here
        // Whether the interest rate is negative.. it can't be.. so generate exception message
        System.out.println("Enter the balance");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble(); // this will take balance input from user
        if(amount < 0){
            throw new NegativeBalanceChecking(amount);
        }
        System.out.println("Enter the InterestRate");
        double interestRate = sc.nextDouble();
        if(interestRate < 0)
            throw new NegativeInterestChecking(interestRate);
        
// Whether the balance is negative.. it can't be.. so generate exception message
        
        
    }
    
}
