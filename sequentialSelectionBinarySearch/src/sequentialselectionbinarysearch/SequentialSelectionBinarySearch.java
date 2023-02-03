/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequentialselectionbinarysearch;

import java.util.Scanner;
/**
 *
 * @author knafi
 */
public class SequentialSelectionBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sequentialSearch();
    }
    public static void sequentialSearch()
    {
        // Create the Array
        int[] array = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you are searching");
        int searchNumber = sc.nextInt();      
        // Do the search from Index 0 to Array Length - 1
        for (int index = 0; index < array.length; index++)
        {
            if(array[index] == searchNumber)
            {
                System.out.println("The value got matched. Array Position " + index);
                System.exit(0);
            }
        }
        System.out.println("No match found. The value is not in array");
        
    }
    
    
}
