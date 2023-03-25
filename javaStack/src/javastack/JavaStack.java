/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javastack;

import java.util.Stack;

/**
 *
 * @author knafi
 */
public class JavaStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> stack = new Stack<Integer>();
        
        // Push example in Stack
        stack.push(12);
        stack.push(24);
        stack.push(36);
        
        // Printing the Stack
        stack.forEach((Integer s) ->{
            System.out.println(s);
        });
        
        // Example of Peek: The top value 
        System.out.println(stack.peek());
        
        // Search method: This will give us Position of the value
        // if it is present in the stacc. Otherwise return -1
        System.out.println(stack.search(26));
        
        System.out.println(stack.size());
        // Poping value from Stack
        int size = stack.size();
        for(int i = 0; i < size; i++){
            System.out.println(stack.pop());
        }
        
        System.out.println(stack.size());
    }
    
}
