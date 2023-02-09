/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school.com;

/**
 *
 * @author knafi
 */
public class school {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        instuctor instcr = new instuctor("Nafi", "kawser", "F-247");
        textBook txtbk = new textBook("OOPII", "Tonny", "Pearson");
        // registration is done
        // the course class has object of Instructor class and textBook Class. So, we
        // need to pass those instance over here
        Course crs = new Course("JavaII", instcr, txtbk);
        
        System.out.println("Course Name: " + crs.getCourseName());
        System.out.println("Instructor Name and Office: "+ 
                crs.getInstructor().getFirstName()+ " " 
                + crs.getInstructor().getLastName() +" "
                + crs.getInstructor().getOfcNumber());
        System.out.println("TextBook Information, title, publisher "
                + "Name and Office: "+ crs.getTextBook().getTitle()
        +" "+ crs.getTextBook().getPublisher() +" " 
                + crs.getTextBook().getTitle());
        
        
    }
    
}
