/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inner_local;

/**
 *
 * @author knafi
 */
public class Library_Inner {
    private int book_ID;
    private String author_name;
    private class Student{
        private int student_ID;
        private String student_name;
        public Student(int student_ID, String student_Name){
            this.student_ID = student_ID;
            this.student_name = student_Name;
        }
        public int get_StudentID(){
            return this.student_ID;
        }
        public String get_StudentName(){
            return this.student_name;
        }        
    }

    public Library_Inner(int bookID, String authorName) {
        this.book_ID = bookID;
        this.author_name = authorName;
    }
    
    /// In the following method, we are trying to return the instance of 
        // Student class, which is an Inner Class from Library_inner class
    private Student st; // instance of the inner class...
     public void setStudentClass(int Student_ID, String Student_name){
            this.st = new Student(Student_ID, Student_name);
     }
     public int getBookID(){
         return this.book_ID;
     }
     public String getAuthorName(){
         return this.author_name;
     }
     public int Student_ID(){
         return st.student_ID;
     }
     public String Student_Name(){
         return st.student_name;
     }
}
