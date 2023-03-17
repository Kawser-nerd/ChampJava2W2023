/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

/**
 *
 * @author knafi
 */
public class Animal {
    protected String name;
    protected int age;
    
  /*  public Animal(){
        
    }*/
   public Animal(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public void eat() {
      System.out.println("Animal is eating");
   }
    
}

