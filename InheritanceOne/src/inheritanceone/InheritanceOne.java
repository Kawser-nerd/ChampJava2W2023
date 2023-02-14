/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritanceone;

/**
 *
 * @author knafi
 */
public class InheritanceOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /// First step will be creating object for Final Exam course "OOPII"
        /// and pass the values over there.
        
        FinalExam fe = new FinalExam( 20, 5, 3);
        /// now we need to calculate the Final Score
        double score = (fe.getNoofQuestions() - fe.getNumberMissed()) 
                * fe.getPointEach();
        fe.setScore(score); // we are using instance for the FinalExam to 
                // set the score of GradeActivity class wihtout creatig
                // any instance of the GradeActivity class
        System.out.println("Total Score: "+ fe.getScore()); // This is GradeActivity method... we are using it over here
        System.out.println("GPA: "+ fe.getGrade()); // This is again GradeAcitivity class member.
        // Final Exam inheriting those members.
        
    }
    
}
