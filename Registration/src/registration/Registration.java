/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class Registration extends Application{
    
    /*
    Database connection and the statement object creation
    */
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        /*
        Database connection
        */
        //Connection con = null;
        //Statement stmt;
        
        
        primaryStage.setTitle("Sign up");
        
        Label lbl1 = new Label("ID");
        TextField txt1 = new TextField();
        
        Label lbl2 = new Label("Email");
        TextField txt2 = new TextField();
        
        Label lbl3 = new Label("Password");
        TextField txt3 = new TextField();
        
        Label lbl4 = new Label("Name");
        TextField txt4 = new TextField();
        
        HBox box1 = new HBox(lbl1, txt1);
        box1.setSpacing(12);
        box1.setAlignment(Pos.CENTER);
        
        HBox box2 = new HBox(lbl2, txt2);
        box2.setSpacing(12);
        box2.setAlignment(Pos.CENTER);
        
        HBox box3 = new HBox(lbl3, txt3);
        box3.setAlignment(Pos.CENTER);
        box3.setSpacing(12);
        
        HBox box4 = new HBox(lbl4, txt4);
        box4.setAlignment(Pos.CENTER);
        box4.setSpacing(12);
        
        Button btn = new Button("Sign Up");
        
        Button btn2 = new Button("Update Info");
        
        HBox box5 = new HBox(btn, btn2);
        box5.setAlignment(Pos.CENTER);
        box5.setSpacing(12);
        
        btn.setOnAction(event ->{
            /// database operation
            int id = Integer.parseInt(txt1.getText())  ; // grabbing ID
            String email = txt2.getText(); // grabbing email address
            String password = txt3.getText(); // grabbig password
            String name = txt4.getText(); // grabbing name
            // Create the DB insert query
            String s = "Insert into registration values('"+ id+"',"
                    + "'"+ email+"','"+ password +"','"+ name +"')";
            
            try {
                // Database Creation
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "1234");
               // Statement Creation
               Statement stmt = con.createStatement();
                
                stmt.execute(s);
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
           });
        
        btn2.setOnAction(event ->{
            /// database operation
            int id = Integer.parseInt(txt1.getText())  ; // grabbing ID
            String email = txt2.getText(); // grabbing email address
            String password = txt3.getText(); // grabbig password
            String name = txt4.getText(); // grabbing name
            // Create the DB insert query
            String s = "Update registration set email='"+email +"',password='"+ password+"',Name='"+name +"' where ID="+id+" ";
            
            try {
                // Database Creation
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "1234");
               // Statement Creation
               Statement stmt = con.createStatement();
                
                stmt.execute(s);
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        });
               
        VBox vbox = new VBox(box1, box2, box3, box4, box5);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12);
        
        
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
