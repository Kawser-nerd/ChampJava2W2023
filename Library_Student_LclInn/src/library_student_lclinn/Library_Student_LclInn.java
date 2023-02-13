/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_student_lclinn;

/**
 *
 * @author knafi
 */
public class Library_Student_LclInn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library lb = new Library(1001, 123456, "Tonny");
        boolean temp = lb.get_verified_student(10002);
        
        if(temp){
            System.out.println("Student got verified");
            System.out.println("Book ID "+ lb.getBookID() + "Issno " + lb.getIssnNo()
            +" Author Name " +lb.getAuthorName() + "could be rented to student");
        }
        else{
            System.out.println("Student is not verified or present.. cant lent");
        }
    }
    
}
