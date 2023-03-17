/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

/**
 *
 * @author knafi
 */
public class Dog extends Animal {
    
   private String breed;

   public Dog(String name, int age, String breed) {
      super(name, age);
      this.name = name;
      this.age = age;
      this.breed = breed;
   }

   public void bark() {
      System.out.println("Dog is barking");
   }
}

    