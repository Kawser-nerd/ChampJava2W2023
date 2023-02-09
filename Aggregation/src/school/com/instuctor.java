/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.com;

/**
 *
 * @author knafi
 */
public class instuctor {
    private String lastName;
    private String firstName;
    private String officeNumber;
    
    /// create constructor
    
    public instuctor(String lName, String fName, String ofcNum){
        this.firstName = fName;
        this.lastName = lName;
        this.officeNumber = ofcNum;
    }
    
    // Copy Constructor
    public instuctor(instuctor object){
        this.firstName = object.firstName;
        this.officeNumber = object.officeNumber;
        this.lastName = object.lastName;
    }
    
   // Mutators
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public String getOfcNumber(){
        return this.officeNumber;
    }
}
