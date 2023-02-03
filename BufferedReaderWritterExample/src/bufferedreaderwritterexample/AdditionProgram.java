/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreaderwritterexample;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author knafi
 */
public class AdditionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        This program will take input from the user as long as they wish to insert
        After that, this program will add all the values together and add the total
        in the same ArrayList. Finally it will print the values to Console.
        */
        
        Scanner sc = new Scanner(System.in);
        String response = null;
        
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        do{
            System.out.println("Enter any interger value"); // as to enter value
            numList.add(sc.nextInt()); // to take input from Console
            System.out.println("Do you want to add more?? Y for Yes, N for No");
            response = sc.next();
        }while(response.equals("Y"));
        
        System.out.println("The Array Size: "+ numList.size());
        
        // Need to add all values of the arrayList.
        
        int total = 0;
        
        for(int i = 0; i < numList.size(); i++) // i is performing index counter
            total+= numList.get(i);// total = total + numList.get(i);
        // Add the total as a new member / entry to arrayList
        numList.add(total);
        
        // Print all the values in the ArrayList and so their total
        for(int i = 0; i < numList.size(); i++)
            System.out.println(numList.get(i)); // get() pulls all the entries one by one
        
    }
    
}
