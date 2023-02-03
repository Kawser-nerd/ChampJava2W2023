/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment10;

/**
 *
 * @author knafi
 */
public class Assignment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]array={{1,2,3}, {4,5,6},{7,8,9},{10,11,12}};
        double[][] arrayD ={{1.2,2.3,3.4}, {4.5,5.6,6.7}, {7.8,8.9,9.1}, {10.1,11.2,12.3}};
        float[][] arrayF ={{1.2f,2.3f,3.4f}, {4.5f,5.6f,6.7f}, {7.8f,8.9f,9.1f}, {10.1f,11.2f,12.3f}};
        long [][]arrayL={{11L,12L,13L}, {14L,15L,16L},{17L,18L,19L},{20L,21L,22L}};
        
        System.out.println(ArrayOperations2D.getAverage(array));
        System.out.println((float) ArrayOperations2D.getAverage(arrayF));
        
        System.out.println(ArrayOperations2D.getHighestInArray(arrayD));
        
        
    }
    
}
