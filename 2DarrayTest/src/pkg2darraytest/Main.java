/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darraytest;

import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create an array size 3,4; means 3 rows, 4 columns
        
        double [][] students = new double[3][4]; // first [] ~ number of rows, 2nd [] ~ number of columns
        Scanner sc = new Scanner(System.in);
        
        // outer loop will control the row indexes from 0 to higher length
        for(int row = 0; row < students.length; row++) // students.length will only give the number of rows
        {
            // inner loop will control the column indexes from 0 to higher index
            for(int col = 0; col < students[row].length; col++) // students[row].length will return the number of columns
            {
                System.out.println("Enter marks for course " + col + "student " + row);
                students[row][col] = sc.nextDouble(); // Here, based on row and column number in the table, we are inserting the scores for student
            }
        }
        
        // This is out of Outer and inner loop. This means, we have taken input to our array
        
        // To print a 2D array, we again need outer loop and inner loop to control Row and Column indexes respectively
        for(int row = 0; row < students.length; row++)
        {
            for(int col = 0; col < students[row].length; col++)
                System.out.print(students[row][col] + " ");
            System.out.print('\n');
        }
    }
    
}
