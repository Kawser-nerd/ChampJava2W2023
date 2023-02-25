/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.chain;

/**
 *
 * @author knafi
 */
public class FinalExam extends GradedActivity{
    private double courseMarks;
    
    public void SetMark(double Marks)
    {
        this.courseMarks = Marks;
    }
    public double getMark(){
        return this.courseMarks;
    }
}
