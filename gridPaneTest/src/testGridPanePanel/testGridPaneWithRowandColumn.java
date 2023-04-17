/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testGridPanePanel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author knafi
 */
public class testGridPaneWithRowandColumn extends Application {
    
    public static void main(String []args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Gridpane Tutorial");
        
        Label lbl1 = new Label("This is Label one");
        Label lbl2 = new Label("This is Label two");
        Label lbl3 = new Label("This is Label Three");
        Label lbl4 = new Label("This is Label four");
        
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        Button btn4 = new Button("Button Fourth");
        // Once the controls are created, we now need to create the GridPane
        // GridPane is a sub-class under javafx.scene.layout.
        
        GridPane gridObject = new GridPane();
        
        /*
        At the beginning of Gridpane, we can not define the row and column number
        We have to give the column and row number based on our design document
        And then need to pass the controls to the column and row box of each
        Gridpane content. The row and column will be gradually extended and 
        Every controls will relatively fix their position in the gridPane
        */
        /*
        If we want to put multiple control in the same gridpane box/container, there
        are two ways to make sure none of the controls are overlapped
        
        1. We can put them in individual row and column in the grid Pane
        e.g. we can put the label in column 0 row 0 
        and we can put the button in column 0 row 1
        
        2. another way is to use VBox or HBox and inside there, we can define the 
        layout and the appearance of each controls.
        */
        
        // we want to add Label 1 at Column 0 Row 0
        gridObject.add(lbl1,  0, 0);
        gridObject.add(btn1,  0, 1);
        // we want to add Label 2 at Column 1 Row 0
        gridObject.add(lbl2, 1, 0);
        gridObject.add(btn2, 1, 1);
        // column number comes at the beginning, then
        // the row number
        
        // we want to add Label 3 at Column 1 Row 0
        gridObject.add(lbl3, 0, 2);
        gridObject.add(btn3, 0, 3);// column number comes at the beginning, then
        // the row number
        
        // we want to add Label 4 at Column 1 Row 0
        gridObject.add(lbl4, 1, 2);
        gridObject.add(btn4, 1, 3);
        
        
        /*
        Now I am going to show you how to use VBox and HBox for multiple Controls
        
        for each set of controls which are going to be put inside a gridpane box/container
        we need to use individual VBox/Hbox for each set
        */
        VBox vbx1 = new VBox(lbl1, btn1);
        VBox vbx2 = new VBox(lbl2, btn2);
        VBox vbx3 = new VBox(lbl3, btn3);
        VBox vbx4 = new VBox(lbl4, btn4);
        
        /*
        After Creating the individual VBoxes, we are now going to add each of the 
        the boxes in it repective column and row position of the gridpane
        */
        
        GridPane gridObject2 = new GridPane();
        gridObject2.add(vbx1, 0, 0);
        gridObject2.add(vbx2, 1, 0);
        gridObject2.add(vbx3, 0, 1);
        gridObject2.add(vbx4, 1, 1);
        
        gridObject2.setHgap(20); // This is row gap
        gridObject2.setVgap(10); // This is column gap
        
        //gridObject.add(gridObject2, 3, 5);
        // we need to create the scene and need to put the gridpane layout on the scene
        Scene scene = new Scene(gridObject2, 400, 400);
        // we now need to pass the scene to the stage object
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
    }
    
}
