/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;
/**
 *
 * @author knafi
 */
public class JavaApplication4 {

    /*
    ArrayList Program
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        We are going to take input 5 names together and will access each of the 
        name one by one
        */
        //The First step is to Create an ArrayList
        // We have to call the Class Name followed by the name of ArrayList
        
        ArrayList<String> nameList = new ArrayList<String>();
        
        // To add a value to arraylist
        // Everytime we need to add a value to arrayList, we need to use
        //add method after ArrayList variable name.
        nameList.add("James"); // index 0
        nameList.add("Catherine"); // index 1
        nameList.add("Nafi"); // index 2
        
        // Retrive any value from ArrayList
       // System.out.println(nameList.get(2));
        
        // To print ArrayList size
        System.out.println(nameList.size());
        
        // Try to print all the information from the ArrayList to Console
        // To get the length of ArrayList, we need to use size() method as followed
        for(int i = 0; i < nameList.size(); i++)
            System.out.println(nameList.get(i));
        // Update the value at ArrayList index 2
        // To update, we have to use set() method. In the set method we have 
        // to pass two parameters, one is the Index, 2nd is the value to update
        
        nameList.set(2, "Kawser"); // To update the value at ArrayList
        
        for(int i = 0; i < nameList.size(); i++)
            System.out.println(nameList.get(i));
        
        // To delete any value from ArrayList, we have to use remove() method
        // Inside remove method, we have to pass the index number which you 
        // want to delete
        // For me, I want to delete index position 1.
        nameList.remove(1);
        
        // Once I remove, it will delete the value as well as free the memory 
        // space
        
        System.out.println("Size : " + nameList.size());
        
        for(int i = 0; i < nameList.size(); i++)
            System.out.println(nameList.get(i));
        
        
    }
    
}
