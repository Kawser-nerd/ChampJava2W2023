/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreaderwritterexample;

import java.util.ArrayList;
/**
 *
 * @author knafi
 */
public class ClassWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // We have to create ArrayList of Objects
         
        ArrayList<Student> objectList = new ArrayList<Student>();
        objectList.add(new Student("Nafi", 23, "abc@champlain.com"));
        objectList.add(new Student("Kawser", 35, "xyz@college.com"));
        
        System.out.println(objectList.get(0).getName() + " " + objectList.get(0).getID() +" " + objectList.get(0).getEmail());
        System.out.println(objectList.get(1).getName() + " " + objectList.get(1).getID() +" " + objectList.get(1).getEmail());
    }
    
}
