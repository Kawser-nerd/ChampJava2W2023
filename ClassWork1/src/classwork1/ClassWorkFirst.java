/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author knafi
 */
public class ClassWorkFirst extends Application {
    
    public static void main(String []args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // we need the stage which is created in previous line
        // We should set the title of the Stage
        primaryStage.setTitle("Classwork One");
        // we need the controls
        Label lbl1 = new Label();
        lbl1.setText("Enter Name");
        
        TextField txt1 = new TextField();
        // If you want to put some text in your textfield, you can set it or you 
        // can keep it open for the user to give input
        
        Button btn1 = new Button();
        btn1.setText("Register");
        // we need another label to take the input from textField and print it
        // on the label
        Label lbl2 = new Label();
       
        // We need the event handler to handle the events attached with each control
        // For now, we are going to work only with the btn event listner handler
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                lbl2.setText("My Name is: " + txt1.getText());
            }
    });
        
        // Now, we need a layout(outer) to place the contents one after another
        VBox vbox = new VBox(15,lbl1, txt1, btn1);
        // we now need to define the allignment of our layout
        vbox.setAlignment(Pos.CENTER);
        
        HBox hbox = new HBox(vbox, lbl2); // Nested layout
        
        // Now we need to create the scene
        Scene scene = new Scene(hbox, 300, 400);// width and heigt are given in pixel
        
        // After scene is created, we have to add them to the stage
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
