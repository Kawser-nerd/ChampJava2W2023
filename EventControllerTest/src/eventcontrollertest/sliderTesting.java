/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventcontrollertest;

import java.io.File;
import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class sliderTesting extends Application{
    public static void main(String []args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Slider Testing");
        double minValue = 0.0;
        double maxValue = 10.0;
        double initialValue = 2.5;
        
        Label lbl1 = new Label("Slider values to be selected");
        
        Slider slider = new Slider(minValue, maxValue, initialValue);
        slider.setShowTickMarks(true);// this will show the value sections in the sliders
        slider.setShowTickLabels(true); // this will show you the labels on the slider
        slider.setMajorTickUnit(2.0);
        slider.setMinorTickCount(5);
        
        
        Button btn1 = new Button("get SliderValue");
        
        // The purpose to add the button in the program is to take the selected
        // value from the slider and print it on Console.
        btn1.setOnAction(event ->{
            String selectedValue = String.valueOf(slider.getValue());
            /*
                The slider always return the values in double format. We can not
            directly use double format value is a String. We need to convert the
            double value to String and then that String value we can pass to our
            label, which accepts String value
            */
            lbl1.setText(selectedValue);
        });
        
        /*
        The slider has its own event handling method. At that time, whenever you
        are sliding the slider ticker, it will directly update the value to the
        labels
        */
        
        slider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            String getSelectedValue = String.valueOf(slider.getValue());
            lbl1.setText(getSelectedValue);
        });
        
        /*
        TextArea
        */
        /*
        To use the TextArea in our program, we need to set the minimum number 
        of rows and columns at the beginning. After that, we can resize it
        at any time
        */
        
        TextArea textarea = new TextArea();
        textarea.setPrefColumnCount(30);
        textarea.setPrefRowCount(20);
        textarea.setText("Enter your answer over here.....");
        
        // We have to create another button to add event handling to textArea
        
        Button btn2 = new Button("Test TextArea");
        btn2.setOnAction(event -> {
            lbl1.setText(textarea.getText());
        });
        
        /*
        FileChooser section
        */
        
        Button btn3 = new Button("Select File");
        
        
        
        btn3.setOnAction(event->{
            FileChooser filech = new FileChooser();
            File fileselected = filech.showOpenDialog(primaryStage);
            if(fileselected != null){
                lbl1.setText("File Name selected: " + fileselected.getName());
            }
        });
        
        VBox vbox = new VBox(lbl1, slider, textarea,btn1, btn2, btn3);
        //vbox.setPrefWidth(maxValue+50);
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
}
