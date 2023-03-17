/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author knafi
 */
public class TestCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This code will show you how the Collection Class and interface works
        
        // ColletionCities are Collection Class object which is holding the cities
        // near or inside Quebec province
        ArrayList<String> CollectionCities = new ArrayList<String>();
        CollectionCities.add("Montreal");
        CollectionCities.add("Ottawa");
        CollectionCities.add("Toronto");
        CollectionCities.add("Laval");
        
        // to print any of the arraylist stuffs, we can use regular Println()
        // this is called iterability or automatic iteration 
        // which is provided by the Collection Class
        System.out.println(CollectionCities);
        
        // We want to whether VanCouver is a near by city of Quebec provice??
        // To see the existance of VanCouver city in the ArrayList, we can use
        // contains Method which will automatically iterate over the CollectionCities
        // Object
        System.out.println("Whether VanCouver is near to Quebec province??" + 
                CollectionCities.contains("VanCouver"));
        // Contains method will return true/ false. If the String/Object/Variable
        // is present in the CollectionCities Object, it will print true, otherwise
        //false
        
        // Now we are going to see the example of Polymorphism in Collection Class
        // Collection Class itself is the superclass of ArrayList.
        // We are now going to create an ArrayList of Collection Type
        // We are going to create a new ArrayList, FruitsInMontreal where We are 
        // going to put available fruits in Montreal
        // Here, collection is the superClass and ArrayList is the subclass..
        Collection<String> fruitsInMontreal = new ArrayList<String>();
        fruitsInMontreal.add("Apple");
        fruitsInMontreal.add("BlueBerry");
        fruitsInMontreal.add("Banana");
        
        // We want to copy the values of fruitsInMontreal available to the list
        // of popularFruitsInMontreal.
        
        Collection<String> popularFruitsInMontreal = 
                new ArrayList<String>(fruitsInMontreal);
        // This process works as a Copy Constructor way. Here, we are passing the object
        // of ArrayList Type to our Collection Class Main Constructor
        
        // We can, instead of accessing each member one by one, we can directlyu
        // use ArrayList Class provided clone() method to copy the members of 
        //one ArrayList to another. 
        // We are going to Copy the collectionCities to CitiesInCanada. We are going to
        // Use clone() to copy all the members from collectionCities to CitiesInCanada
        ArrayList<String> citiesInCanada = new ArrayList<String>();
        citiesInCanada = (ArrayList<String>) CollectionCities.clone();
        
        // as java use dynamic casting, at the time of using clone method, you need to 
        // use the ArrayList casting with propor DataType
        
        //two more methods which we can use with Collection subclasses. One is 
        // addAll(), another is retainAll(). addAll() method will help to add two 
        // ArrayLists together and put them in a ArrayList
        //Lets all all the members of citiesInCanada to popularFruitsInMontreal ArrayList Obejct
        
        popularFruitsInMontreal.addAll(citiesInCanada);
        
        System.out.println(popularFruitsInMontreal);
        
        // removeAll() will remove the citiesInCanada members from popularFruitsInMontreal
        popularFruitsInMontreal.removeAll(citiesInCanada);
        System.out.println(popularFruitsInMontreal);
        // retainAll() will only keep the values which are similar in both Collection/List
        // For eg, the first following line will add cities to popularFruitsInMotreal
        // and the values will be [Apple, BlueBerry, Banana, Montreal, Ottawa, Toronto, Laval]
        // now, when you retain only the cities in the list, it will get match with the 
        // city names of the first list and will keep only the city names, will drop
        // the fruits name from the list
        popularFruitsInMontreal.addAll(citiesInCanada);
        popularFruitsInMontreal.retainAll(citiesInCanada);
        System.out.println(popularFruitsInMontreal);
        
        // Iterrator Class
        // In our citiesInCanada object, which is an ArrayList object, we can use
        // Iterator Interface to automaticall iterate from the beginnig members to 
        // the end member. Lets try to transfer the members in citiesInCanada
        // ArrayList to their UpperCase letters.
        
        // At first, we need to create an instance of our Iterator Class
        
        Iterator<String> cities = citiesInCanada.iterator();
        // now, the cities is going to work as an automatic interator/controller
        // of our citiesInCanada ArrayList
        // Now, we can use regular loop to access each of the list members one by one
        // at first, we will use while loop to access members individually, then we will 
        // use for loop
        while(cities.hasNext()){
            System.out.println(cities.next().toUpperCase());
        }
        // for using for loop, we don't need to use Iterator Object, rather
       // that we can use the ArrayList itself
        for(String s:citiesInCanada)
            System.out.println(s.toUpperCase());
        
        // for-each
        citiesInCanada.forEach(s -> {
            System.out.println(s.toUpperCase());
        });
      
        
        
    }
    
}
