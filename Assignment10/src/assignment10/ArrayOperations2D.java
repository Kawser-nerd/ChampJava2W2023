/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment10;

/**
 *
 * @author knafi
 */
public class ArrayOperations2D {
    public ArrayOperations2D(){ // Constructor
        
    }
    
    public static int getTotal(int array[][])
    {
        int total = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
            }
        }
        
        return total;
    }
    public static float getTotal(float array[][])
    {
        float total = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
            }
        }
        
        return total;
    }
    public static double getTotal(double array[][])
    {
        double total = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
            }
        }
        
        return total;
    }
    public static long getTotal(long array[][])
    {
        long total = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
            }
        }
        
        return total;
    }
    
    public static int getAverage(int array[][])
    {
        int total = 0;
        int totalElements = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
                totalElements++;
            }
        }
        
        int average = total/totalElements;
        return average;
    }
    public static float getAverage(float array[][])
    {
        float total = 0;
        int totalElements = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
                totalElements++;
            }
        }
        
        float average = total/totalElements;
        return average;
    }
    
    public static double getAverage(double array[][])
    {
        double total = 0;
        int totalElements = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
                totalElements++;
            }
        }
        
        double average = total/totalElements;
        return average;
    }
    
    public static long getAverage(long array[][])
    {
        long total = 0;
        int totalElements = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                total+=array[row][col];
                totalElements++;
            }
        }
        
        long average = total/totalElements;
        return average;
    }
    
    public static int getRowTotal(int array[][], int rowno){
        int total = 0;
        
        for(int row = 0; row < array.length; row++){
            if(row == rowno){
                for(int col = 0; col < array[row].length; col++){
                    total+=array[row][col];
                }
            }
        }
        
        return total;
    }
    public static double getRowTotal(double array[][], int rowno){
        double total = 0;
        
        for(int row = 0; row < array.length; row++){
            if(row == rowno){
                for(int col = 0; col < array[row].length; col++){
                    total+=array[row][col];
                }
            }
        }
        
        return total;
    }
    
    public static float getRowTotal(float array[][], int rowno){
        float total = 0;
        
        for(int row = 0; row < array.length; row++){
            if(row == rowno){
                for(int col = 0; col < array[row].length; col++){
                    total+=array[row][col];
                }
            }
        }
        
        return total;
    }
    
    public static long getRowTotal(long array[][], int rowno){
        long total = 0;
        
        for(int row = 0; row < array.length; row++){
            if(row == rowno){
                for(int col = 0; col < array[row].length; col++){
                    total+=array[row][col];
                }
            }
        }
        
        return total;
    }
    
    public static int getColumnTotal(int array[][], int colNo){
        int total = 0;
        
        for(int row = 0; row < array.length; row++){
            total+= array[row][colNo];
        }
        return total;
    }
    
    public static float getColumnTotal(float array[][], int colNo){
        float total = 0;
        
        for(int row = 0; row < array.length; row++){
            total+= array[row][colNo];
        }
        return total;
    }
    public static double getColumnTotal(double array[][], int colNo){
        int total = 0;
        
        for(int row = 0; row < array.length; row++){
            total+= array[row][colNo];
        }
        return total;
    }
    
    public static long getColumnTotal(long array[][], int colNo){
        long total = 0;
        
        for(int row = 0; row < array.length; row++){
            total+= array[row][colNo];
        }
        return total;
    }
    
    public static int getHighestInArray(int array[][]){
        int highest= 0;
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(highest < array[row][col]){
                    highest = array[row][col];
                }
            }
        }
        return highest;
    }
    
    public static float getHighestInArray(float array[][]){
        float highest= 0;
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(highest < array[row][col]){
                    highest = array[row][col];
                }
            }
        }
        return highest;
    }
    public static double getHighestInArray(double array[][]){
        double highest= 0;
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(highest < array[row][col]){
                    highest = array[row][col];
                }
            }
        }
        return highest;
    }
    public static long getHighestInArray(long array[][]){
        long highest= 0;
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(highest < array[row][col]){
                    highest = array[row][col];
                }
            }
        }
        return highest;
    }
    
    public static int getLowestInArray(int array[][]){
        int lowest= 9999999; // a garbage highest value
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(lowest > array[row][col]){
                    lowest = array[row][col];
                }
            }
        }
        return lowest;
    }
    
    public static float getLowestInArray(float array[][]){
        float lowest=  9999999; // a garbage highest value
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(lowest > array[row][col]){
                    lowest = array[row][col];
                }
            }
        }
        return lowest;
    }
    
    public static double getLowestInArray(double array[][]){
        double lowest= 9999999; // a garbage highest value
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(lowest > array[row][col]){
                    lowest = array[row][col];
                }
            }
        }
        return lowest;
    }
    public static long getLowestInArray(long array[][]){
        long lowest= 9999999; // a garbage highest value
        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++){
                if(lowest > array[row][col]){
                    lowest = array[row][col];
                }
            }
        }
        return lowest;
    }
}
