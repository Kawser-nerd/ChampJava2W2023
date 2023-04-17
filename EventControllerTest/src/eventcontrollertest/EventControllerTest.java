/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventcontrollertest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class EventControllerTest extends Application {
    
    private Label lbl1;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Testing Event Handler");
        
        lbl1 = new Label("This is Before Event Handling");
        Button btn1 = new Button("Click Me");
        
        /*
        Here, we are going to see how to work with Radio Button
        
        We need to create individual radio button for each of the option/choice
        */
        
        RadioButton radio1 = new RadioButton("Choice One");
        RadioButton radio2 = new RadioButton("Choice Two");
        RadioButton radio3 = new RadioButton("Choice Three");
        
        /*
        If we don't add the radio buttons under the toggle group, all the radio
        buttons could be selected. So, to select only one at a time, we need to 
        add all the buttons under a toggle group.
        */
        
        ToggleGroup radioToggleGroup = new ToggleGroup();
        
        // Once the toggle group is created, our 2nd work is to add each of the
        // radio buttons under the toggle group
        
        radio1.setToggleGroup(radioToggleGroup);
        radio2.setToggleGroup(radioToggleGroup);
        radio3.setToggleGroup(radioToggleGroup);
        
        /*
        Once the radio buttons are added to the togglegroup, we need to add
        backend code with each of the radio button. If the button is selected, 
        we can change the lable, generate/execute a method or can perform any logica
        progral there
        */
        
        /*
        We can put the whole logic of our radio buttons under another controls'
        event handler. Or we can create individual event handler for each of the 
        radio buttons
        
        */
        
        radio1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Choice One is Selected From Event Handling");
            }
        });
        
        radio2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Choice Two is Selected From Event Handling");
            }
        });
        
        radio3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Choice Three is Selected From Event Handling");
            }
        });
        
        
        CheckBox chk1 = new CheckBox("Choice One");
        CheckBox chk2 = new CheckBox("Choice Two");
        CheckBox chk3 = new CheckBox("Choice Three");
        
        /*
        If we don't add the radio buttons under the toggle group, all the radio
        buttons could be selected. So, to select only one at a time, we need to 
        add all the buttons under a toggle group.
        */
        
        ToggleGroup checkBoxToggleGroup = new ToggleGroup();
        
        // Once the toggle group is created, our 2nd work is to add each of the
        // radio buttons under the toggle group
        
        /*
        We need to create event handler for each of the the CheckBox
        */
       
        chk1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Check Box 1 is Clicked");
            }
        });
        
        chk2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Check Box 2 is Clicked");
            }
        });
        
        chk3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("Check Box 3 is Clicked");
            }
        });
        
        
        VBox vbox = new VBox(lbl1, radio1, radio2, radio3, chk1, chk2, chk3, btn1);
        vbox.setAlignment(Pos.CENTER);
        
        /// Event Handling relates to the interaction with the javafx controls
        /*
        and the back ground code. If you interact with any control, it will trigger 
        the event coded in Java at back-end
        
        we can do this in two ways. The first way is to have a seperate Event handler
        class and call that class inside your control/ event trigger.
        */
        //btn1.setOnAction(new ButtonClickEvent());
        
        /*
        Another way to perform the eventhandling custom class is to create an inner
        class which is going to implement the eventhandler interface
        */
        //btn1.setOnAction(new ButtonClickEvent2());
        /*
        The third way to implement the event handler method is to implement the 
        instance of the EventHandler insider the method, create the interface type 
        with ActionEvent and then override the handle abstract method
        */
        btn1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            if(radio1.isSelected()){
            lbl1.setText("Radio Option One is selected");
        }
        else if (radio2.isSelected())
            lbl1.setText("Radio Option Two is selected");
        else if (radio3.isSelected())
            lbl1.setText("Radio Option Three is selected");
        }
    });
        
        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /*
    Creating an event handler inner class
    */
    class ButtonClickEvent2 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            System.out.println("2nd Way of Event Handling");
            lbl1.setText("Button in clicked");
        }
    }
    
}


