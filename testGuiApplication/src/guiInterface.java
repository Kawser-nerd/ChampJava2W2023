
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knafi
 */
public class guiInterface extends Application{

    @Override
    public void start(Stage primaryStage) {
        // At the beginning, you have to put a title for your application
        primaryStage.setTitle("Our First GUI application Testing");
        
        // First label of our life
        Label label1 = new Label("Label 1");
        // First Button of our program.. If you want to show any text with the button
        // put that inside the parantheses
        Button btn1 = new Button("Button One");
        // once the button object is created, we need to add the listner with the object
        // to add the listner, we first need to class the action method
        // Inside the action method, we need to create the event with EventHandler
        //interface which is going to trigger when the object is clicked.
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               System.out.println("Button One Clicked");
               label1.setText("Button One Clicked");
            }
        });
       
        Label label2 = new Label("Label 2");
        Button btn2 = new Button("Button Two");
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button 2 Clicked");
                label2.setText("Button 2 Clicked ");
            }
        });
        
        Label label3 = new Label("Label 3");
        Button btn3 = new Button("Button Three");
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button 3 Clicked");
                label3.setText("Button 3 Clicked ");
            }
        });
        // After creating the nodes to see, we now need to give the layout
        // how the nodes are going to display on the screen/stage
        // For first example, we are going to use VBox layout. 
        VBox vbox = new VBox(label1, btn1, label2, btn2, label3, btn3);
        
        //Once we develop the layout, we need to pass it to the scene to visible
        // Scene works as a communication between the stage and the Control Objects
        // Inside the Scene constructor, we need to pass the scene pixels 
        // in row and column format. Lets say, we want to have a 300X200 pixels scene
        Scene scene = new Scene(vbox, 300, 200);
        
        // Once the scene is created, you have to pass it to the stage object
        // so that the stage can know which scene it is going to display
        primaryStage.setScene(scene);
        
        // To show the stage box properly, you have to use show method. Otherwise. the 
        // program will terminate and nothing will be visible.
        primaryStage.show();
    }
    
    public static void main(String []args){
        launch(args);
    }
    
}
