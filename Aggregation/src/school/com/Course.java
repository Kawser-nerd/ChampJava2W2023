/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.com;

/**
 *
 * @author knafi
 */
public class Course {
    private String courseName;
    private instuctor instructor;
    private textBook txtBook;
    
    public Course(String crsName, instuctor instcr, textBook txtbk){
        this.courseName = crsName;
        this.instructor = instcr;
        this.txtBook = txtbk;
    }
    public String getCourseName(){
        return this.courseName;
    }
    
    public instuctor getInstructor(){
        return this.instructor;
    }
    
    public textBook getTextBook(){
        return this.txtBook;
    }
}
