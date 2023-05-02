/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadbmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author knafi
 */
public class JavaDbMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        //step: 1: create a connection
        Connection con = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", 
                        "root", "1234");// connectionString
        
        // step 2: Create the Query/Statment
        //First Query will be insert Query
        //String s="insert into student values(1111, 'test4@gmail.cm', 'Winter2023')";
        //Statement stmt = con.createStatement();
        
        // step3: Execute the Query
        //stmt.execute(s);
        // step 4: Close Connection
        
        /*
        Update operation // Queries
        */
        
        //String s= "Update student set email='friday@gmail.com' where studentID=1111";
        
        // execute
        Statement stmt = con.createStatement();
        //stmt.execute(s);
        
        /*
        Delete entry or student
        */
        
        //String s = "Delete from student where studentID=1005";
        //stmt.execute(s);
        
        /*
        Select Queries
        */
        
        // create the query
        String s = "Select * from student";
        
        // whenever we are going to perform any select query, it will return
        // the result and that result, in java, needs to put in ResultSet
        
        ResultSet rs = stmt.executeQuery(s);
        
        while(rs.next()){
            System.out.print("student ID " + rs.getInt("studentID")
            + " " + "email: " + rs.getString("email") +
                    "term: " + rs.getString("term"));
            System.out.print("\n");
        }
        con.close();
    }
    
}
