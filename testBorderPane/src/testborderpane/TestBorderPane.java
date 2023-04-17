/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testborderpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class TestBorderPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test BorderPane!");
        
        /// In BorderPane, we need to create the controls at the beginning..
        // We need to put all the controls we are going to put in each region
        // of borderPane in a single layout.
        // In borderPane, we have 5 regions
        
        Label lbl1 = new Label("Label One");
        Button btn1 = new Button("Button One");
        
        Label lbl2 = new Label("Label Two");
        Button btn2 = new Button("Button Two");
        
        Label lbl3 = new Label("Label Three");
        Button btn3 = new Button("Button Three");
        
        Label lbl4 = new Label("Label Four");
        Button btn4 = new Button("Button Four");
        
        Label lbl5 = new Label("Label Five");
        Button btn5 = new Button("Button Five");
        
        // After creating all the controls, we need to put them in a DIFFERENT layout
        // The layouts could be HBox, VBox or GridPane.
        
        VBox topRegion = new VBox(lbl1, btn1);
        topRegion.setAlignment(Pos.CENTER);
        VBox leftRegion = new VBox(lbl2, btn2);
        leftRegion.setAlignment(Pos.CENTER);
         VBox centerRegion = new VBox(lbl3, btn3);
         centerRegion.setAlignment(Pos.CENTER);
        VBox rightRegion = new VBox(lbl4, btn4);
        rightRegion.setAlignment(Pos.CENTER);
        VBox bottonRegion = new VBox(lbl5, btn5);
        bottonRegion.setAlignment(Pos.CENTER);
        
        // after fixing the layout, we are going to put all the layout objects
        // one after another in the BorderPane regions
        
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(topRegion);
        borderpane.setLeft(leftRegion);
        borderpane.setCenter(centerRegion);
        borderpane.setRight(rightRegion);
        borderpane.setBottom(bottonRegion);
        borderpane.setMaxWidth(50);
        
        
        // after setting up the contents/controls of the borderpane, we need
        // to pass the object to Scene so that it could be viewed on the stage
        
        Scene scene = new Scene(borderpane, 300, 250);
        
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
