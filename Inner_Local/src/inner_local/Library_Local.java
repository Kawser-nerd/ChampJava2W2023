/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inner_local;

/**
 *
 * @author knafi
 */
public class Library_Local {
    private int book_ID;
    private String author_name;

    public Library_Local(int book_ID, String author_name) {
        this.book_ID = book_ID;
        this.author_name = author_name;
    }
    
    public int get_BookID(){
        return this.book_ID;
    }
    
    public String get_AuthorName(){
        return this.author_name;
    }
    
    public void StudentInfo(){
        class Student{
            private int student_ID;
            private String student_name;
            public void set_StudentID(int studentID){
                this.student_ID = studentID;
            }
            public void set_Student_Name(String studentName){
                this.student_name = studentName;
            }
            public int get_StudentID(){
                return this.student_ID;
            }
            public String get_StudentName(){
                return this.student_name;
            }        
        }
    }
    
}
