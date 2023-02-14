/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceone;

/**
 *
 * @author knafi
 */
/// This FinalExam class is derived class/child/SubClass
public class FinalExam extends GradeActivity{
    private int numQuestions;
    private double pointsEach;
    private int numberMissed;

    public FinalExam(int numofQues, double pontEach, int numMiss) {
        this.numQuestions = numofQues;
        this.pointsEach = pontEach;
        this.numberMissed = numMiss;
    }
    public int getNoofQuestions(){
        return this.numQuestions;
    }
    public double getPointEach(){
        return this.pointsEach;
    }
    public int getNumberMissed(){
        return this.numberMissed;
    }
    
    
}
