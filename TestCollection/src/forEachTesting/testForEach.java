/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forEachTesting;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author knafi
 */
public class testForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create an ArrayList
        List<String> listofCities = new ArrayList<String>();
        // Add the elements
        listofCities.add("Montreal");
        listofCities.add("Ottawa");
        listofCities.add("St - Lambert");
        
        // for loop
        for(int element = 0; element< listofCities.size(); element++)
            System.out.print(listofCities.get(element) + ' ');
        System.out.print("\n"); // to add new line in the console
        
        // another variation for ArrayList - in an iterable way
        for(String city:listofCities)
            System.out.println(city);
        
        // forEach
        listofCities.forEach((String city) ->{
            // all the logical code block inside this paranthesis
            System.out.println(city);
        });
        
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        numbers.add(13);
        numbers.add(16);
        numbers.add(18);
        numbers.add(19);
        numbers.add(21);
        numbers.add(26);
        
        numbers.forEach((Integer num) ->{
            if(num % 2 == 0){
                num+=10;
                evenList.add(num);
            }
            else{
                num+=5;
                oddList.add(num);
            }
        });
        
        System.out.println(evenList);
        System.out.println(oddList);
        
    }
    
}
