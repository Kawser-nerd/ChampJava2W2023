/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferedreaderwritterexample;

/**
 *
 * @author knafi
 */
public class Student {
    String Name;
    int ID;
    String Email;
    Student(String Name, int ID, String Email){
        this.Name = Name;
        this.ID = ID;
        this.Email = Email;
    }
    public String getName(){
        return this.Name;
    }
    public int getID(){
        return this.ID;
    }
    public String getEmail(){
        return this.Email;
    }
}
