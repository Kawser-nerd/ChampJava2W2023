/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QueueExample;

import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author knafi
 */
public class javaQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> queue = new LinkedList<Integer>();
        
        // To put/add/push anything in the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        
        // To print the values of a queue
        queue.forEach((Integer s) ->{
            System.out.println(s);
        });
        
        // to see the head value
        System.out.println("The head value " + queue.peek());
        System.out.println("The size of queue before pop" + queue.size());
        // To pull/pop any value from queue
        int size = queue.size();
        for(int i = 0; i<size; i++)
            System.out.println(queue.remove());
        
        System.out.println("The size of queue after pop" + queue.size());
    }
    
}
