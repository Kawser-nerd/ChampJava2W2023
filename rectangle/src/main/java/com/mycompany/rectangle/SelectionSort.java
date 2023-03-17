/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.rectangle;

/**
 *
 * @author knafi
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        int []a = {5,3,4,7,2};
        int []ascn = a;
        int counter = 0;
        int smallest = a[0];
        
        while(a.length > 0){
        for(int i = 0; i < a.length; i++){
            if(smallest > a[i])
                smallest = a[i];
        }
        ascn[counter] = smallest;
        counter++;
        int []temp = new int[a.length - 1];
       
        int index = 0;
        
        System.out.println("lenth" + a.length);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
            if(smallest!= a[i]){
                temp[index] = a[i];
                index++;
            }
        }
    
        System.out.println("Loop One");
       
        a = temp;        
     
       }
        
        
    }
}
