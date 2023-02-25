/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism.chain;

/**
 *
 * @author knafi
 */
public class PolyMorphismChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        passFailExam exam = new passFailExam();
        exam.setMarks(79.5);
        exam.setPassFail(79.5);
        exam.setGrade('B');
        // The reason of this error is we are trying to access 
        // a class which is not in the chain of inheritance
        //exam.setMark(0);
        
        // Polymorphism
        
        
       GradedActivity exam2 = new passFailActivity();
        exam2.setGrade('B');
        
        passFailActivity exam3 = new passFailActivity();
        
    }
    
}
