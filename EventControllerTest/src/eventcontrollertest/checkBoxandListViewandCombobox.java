/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventcontrollertest;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class checkBoxandListViewandCombobox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckBox and ListView and Combobox");
        
        /*
        We need a label so that we can see the changes happening when we are
        selecting the checkboxes one after another
        */
        Label lbl1 = new Label("Check Box Testing");
        // To create checkBox, we first need to create the instances and then
        // need to pass the values
        
        CheckBox chk1 = new CheckBox("CheckBox One");
        CheckBox chk2 = new CheckBox("CheckBox Two");
        CheckBox chk3 = new CheckBox("CheckBox Three");
        
        /*
        After creating instance of checkbox, we need the layout where we are going 
        to put all the check boxes one after another. For each checkbox, we need
        individual event handling/ event handler
        event handling can be done in two ways: 
        1. with regular method option
        */
        
        chk1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                lbl1.setText("CheckBox one is selected");
                /*
                To toggle when one checkbox is selected, we need to deselect/
                setSelected to false for all other checkboxes
                */
                chk2.setSelected(false); // this option will deselect the checkbox
                chk3.setSelected(false);
            }
        });
        
        /*
        another way to perform event handling is to use Lambda Expression
        2. Lambda Expression based event handling
        */
        
        chk2.setOnAction(event ->{ // The Lambda Expression
            lbl1.setText("CheckBox two selected");
            chk1.setSelected(false);
            chk3.setSelected(false);
        });
        
        chk3.setOnAction(event ->{ // The Lambda Expression
            lbl1.setText("CheckBox three selected");
            chk1.setSelected(false);
            chk2.setSelected(false);
        });
        
        
        /*
        ListView is used to list a group of items together on our GUI. You can select
        one item from the group and then perform action with that selected item. 
        At the beginning of using ListView, you need to put all the options as
        an ArrayList and then the user can select one item/ multiple items based
        on your priority.
        
        At the beginning, we will see only one option selection from a listView
        At first, we need to create a listview same as ArrayList
        */
        
        ListView<String> listview = new ListView<String>();
        
        // We now need to add all the items we want to view on ListView
        // if you use add method it will all you to add one item, if you want to 
        // add more items at a time, you have to use addall() method.
        listview.getItems().addAll("Montreal", "Ottawa", "Toronto", "Halifax", 
                "Vancouver", "Edmonton", "Calgary");
        listview.setPrefSize(120, 100);
        
        /*
        Once the listview is created, we need to access the selected member from the
        listview. We can do that in two ways:
        1. we can create a button and inside button listner event, we can call the 
        listview selected item to be collected and proceeded
        */
        Button btn1 = new Button("Select Option");
        
        btn1.setOnAction(event ->{
            // we need the method which will return the selected item from listview
            // and will view that information in the label
            
            // as our listview items are holding String datatype, we are using
            // String datatype value to hold the selected value
            String selectedItem = listview.getSelectionModel().getSelectedItem();
            lbl1.setText(selectedItem);
        });
        
        /*
        Another way to handle the selected option from the listview is to add
        listview event handler in your program. But the way to add the listview eventhandler
        in your program is different
        2. listview eventhandler
        */
        listview.getSelectionModel().selectedIndexProperty().addListener(event ->{
            String selectedLabel = listview.getSelectionModel().getSelectedItem();
            lbl1.setText(selectedLabel);
        });
        
        /*
        Till now, we can select only one option from the listview. We can select
        multiple options whenever needed. To do that, we need to configure our selection
        model and have to enable multiple option.
        */
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Button btn2 = new Button("Multiple Option");
        
        btn2.setOnAction((event) ->{
            ObservableList<String>selectedItems = 
                    listview.getSelectionModel().getSelectedItems();
            String temp = "";
            for(int i = 0; i < selectedItems.size(); i++)
                temp += selectedItems.get(i).toString() +" ";
            lbl1.setText(temp);
        });
        
        /*
        ListView Orientation
        By default the orientation is Vertical, top to bottom. We can change 
        the orientation from Left to Right, by changing the orientation to Horizontal
        */
        listview.setOrientation(Orientation.HORIZONTAL);
        
        /*
        ComboBox is same as ListView, only difference is all the options will
        be visible as button
        */
        
        ComboBox<String> cmbx = new ComboBox<String>();
        cmbx.getItems().addAll("Montreal", "Ottawa", "Toronto", "Halifax", 
                "Vancouver", "Edmonton", "Calgary");
        
        /*
        To access combobox items, we can follow two one. 
        1. We can create a button event and catch the selected value in it
        */
        Button btn3 = new Button("Select Combobox Option");
        btn3.setOnAction(event ->{
            lbl1.setText(cmbx.getValue()); // getValue() will return the selected 
            // value from the combobox
        });
        /*
        2. We can directly create combobox event handler to get the selected value
        */
        cmbx.setOnAction(event ->{
            lbl1.setText(cmbx.getValue()); // getValue() will return the selected 
            // value from the combobox
        });
        
        VBox vbox = new VBox(lbl1, chk1, chk2, chk3, listview, btn1, btn2, cmbx, btn3);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String []args){
        launch(args);
    }

    private void forEach(ObservableList<String> selectedItems) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
