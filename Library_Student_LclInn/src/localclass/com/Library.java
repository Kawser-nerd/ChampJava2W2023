/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localclass.com;

/**
 *
 * @author knafi
 */
public class Library {
    private int BookID;
    private int ISSNNo;
    private String Author_Name;
    //we can use constructor to assign the values to library variables
    public Library(int bookid, int issnno, String authorname){
        this.BookID = bookid;
        this.ISSNNo = issnno;
        this.Author_Name = authorname;
    }
    public int getBookID(){
        return this.BookID;
    }
    public int getIssnNo(){
        return this.ISSNNo;
    }
    public String getAuthorName(){
        return this.Author_Name;
    }
    public boolean get_verified_student(int student_ID){
        /// Now we have to create local class
        /// Inside the method body, we can't give access modifier to any class
        
        class Student{
        // the following variable is a constant array which will work as local
        // variable.. The values will be previously defined or can be taken 
        // from a file or any other class
        private String[] student_id ={"10001","10002", "10003" };
        // this means, only 3 students with the given IDs are register.
        private String studentIDToVerify;
        // Constructor of student class
        public Student(int studentIDtoVerify){
            // String.valueOf convert the integer/any datatype values to String
            // the following line will convert the integer value to String value
           this.studentIDToVerify = String.valueOf( studentIDtoVerify);
        }
        
        public boolean get_studentID_verified(){
            // we will verify the student id. if the id length is 6, its valid 
            // otherwise, not valid
            if(this.studentIDToVerify.length() == 5)
                return true;
            else
                return false;
        }
        
        public boolean getStudentVerified(){
            // we will verify whether the student ID is present in the student_ID
            // array or not
            boolean temp = false;
            for(int i = 0; i < this.student_id.length; i++)
                if (this.studentIDToVerify.equals(this.student_id[i])){
                    //return true;
                    //break;
                    temp = true;
                }
            return temp;
        }
       
    }
        // the class scope needs to be completed/closed
        /// Create the instance of Student Class
        Student st = new Student(student_ID);
        if(st.getStudentVerified() && st.get_studentID_verified())
            return true;
        else
            return false;
   }
    
}
