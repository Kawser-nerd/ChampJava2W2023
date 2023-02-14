/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceone;

/**
 *
 * @author knafi
 */
/// This is the superclass/Base class/Parent Class
public class GradeActivity {
    private double score;
    
    public void setScore(double s){
        this.score = s;
    }
    public double getScore(){
        return this.score;
    }
    public char getGrade(){
        if (score >= 60 && score < 70)
            return 'D';
        else if (score >= 70 && score <80)
            return 'C';
        else if (score >= 80 && score <90)
            return 'B';
        else if (score >=90 )
            return 'A';
        else 
            return 'F';
    }
    
}
