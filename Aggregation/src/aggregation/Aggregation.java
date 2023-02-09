/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author knafi
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student();
        st.setID(10);
        st.setName("Nafi");
        
        /// This line, to set the address of the student, we need to 
        // use the structure of the Address class and pass that
        // instance in the student class
        
        Address adrs = new Address(); // Create the instance of Address class
        adrs.setAprtName(23);
        adrs.setRoadName("St-lambert");
        adrs.setCityName("Montreal");
        
        // in the following line, we are going to pass the instance of 
        // address class as an object/parameter/member to student class
        st.setAddress(adrs);
        
        System.out.println("The Entries are");
        System.out.println("Student ID: " + st.getID());
        System.out.println("Student Name: " + st.getName());
        // st.getAddress() is returning us the instance of Address class.
        // with help of that, we can now access each of the members of Address class
        System.out.println("Student Aprt No: " + st.getAddress().getAprtName());
        System.out.println("Student RoadName : " + st.getAddress().getRoadName());
        System.out.println("Student City Name: " + st.getAddress().getCityName());
        
    }
    
}
