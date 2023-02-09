/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author knafi
 */
public class Student {
    private int id;
    private String name;
    private Address address;
    
    // Mutators
    public void setID(int Id){
        this.id = Id;
    }
    
    public void setName(String Name){
        this.name = Name;
    }
    /// We are going to pass the addresss instance as a variable for
    /// this Student class. here, this.address is going to take that
    /// instance of Address class
    public void setAddress(Address adrs){
        this.address = adrs;
    }
    
    /// Accessors
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Address getAddress(){
        return this.address;
    }
    
}
