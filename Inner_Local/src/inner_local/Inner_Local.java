/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inner_local;

/**
 *
 * @author knafi
 */
public class Inner_Local {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library_Inner LI = new Library_Inner(12, "Tonny Geddes");
        LI.setStudentClass(1001, "Nafi");
        
        System.out.println(" The Student ID: " + LI.Student_ID() + " Name " +
        LI.Student_Name() + " Book ID "+ LI.getBookID() + " Author Name " +
                LI.getAuthorName());
        
        
        //// Local Class
      
        
    }
    
}
