/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author knafi
 */
public class textEditor extends Application {

    /*
        At the beginning when we are going to use Menubar in our program, we
        need to predefine what elements/Menuitems we are going to use with the Menubar
        We need to initialize all of the them at the beginning so that we can 
        easily reuse them throughout the program
        */
    /*
    We are going to create instances of each class/elements inside the methodBody
    so that the initialization happens inside the method scope. And we are creating
    these instance as global so that all the methods can use the same instances 
    throughout the program
    */
    private MenuBar menubar;
    private Menu fileMenu; // This is the main controlling Menu
    private Menu textMenu; // this is Edit Menu
    /*
    For fileMenu, we are going to create the items/elements in this space. 
    We are going to use 3 items, open, save and Exit
    */
    private MenuItem openItem;
    private MenuItem saveItem;
    private MenuItem closeItem;
    
    /*
    For textMenu, we are going to use 3/4 radiobutton menu and 1 checkbox menu.
    */
    
    private RadioMenuItem blackitem;
    private RadioMenuItem reditem;
    private RadioMenuItem blueitem;
    private RadioMenuItem greenitem;
    private CheckMenuItem checkitem;
    
    /*
    we are going to use a textArea where we are going to edit our text
    */
    private TextArea textEditor;
    private Label lbl1;
    public static void main(String [] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        /*
        All the codes related to JavaFx should be put in this method scope. We are 
        going to create and call user-defined methods in this start method scope.
        */
        
        primaryStage.setTitle("Hello TextEditor");
        
        lbl1 = new Label("TextEditor for Java 2 Students");
        textEditor = new TextArea("Here is your editor....");
        textEditor.setPrefColumnCount(30);
        textEditor.setPrefRowCount(20);
        /*
        Columncount and rowcount helps us to put a width and height to our textArea
        section
        */
        VBox vbox = new VBox(lbl1, textEditor);
        
        /*
        In this section, we need to call our FileMenu and textMenu methods to
        create their instances so that we can add them to our regular menuBar
        */
        //at the beginnnig of the FileMenu, we need to create the instance
        // for the file menu. In the global space, we have already created the
        // instance, now we need to reinitialize it
        
        fileMenu = new Menu("File");// this will put the name of the menu button
        
        // once the fileMenu is created, we now need to add items one by one,
        // in other words, multiple option
        
        openItem = new MenuItem("Open File");
        saveItem = new MenuItem("Save File");
        closeItem = new MenuItem("Exit");
        
        /*
        Once these code blocks are done, that means you have File menu with three
        options available to choose.
        
        Once the menu design is completed, we need to add event handler with each
        of the options we created
        */
        openItem.setOnAction(event ->{
            FileChooser filech = new FileChooser();
            File fileSelected = filech.showOpenDialog(primaryStage);
            if(fileSelected != null){
                try {
                    /*
                    once the file is selected, we need to open and read the file contents
                    We are going to use Scanner class to read the file
                    */
                    Scanner sc = new Scanner(fileSelected.getAbsoluteFile());
                    /*
                    Once we open the file to read the contents, we are going to read
                    them line by line. So, we need a temporary string where are going
                    to add each line one by one when we read them and finally 
                    put the whole String in the textArea to view the contents
                    */
                    String temp = "";
                    while(sc.hasNext()){
                        temp += sc.nextLine() + " ";
                    }
                    textEditor.setText(temp); // this line will put all the contents
                    // of the file in the textEditor area
                    sc.close();// it is best practice to close a file after reading
                } catch (FileNotFoundException ex) {
                    lbl1.setText(ex.getMessage());
                }
            }
        });
        
        /*
        now we need to add handler for the saveitem
        */
        
        saveItem.setOnAction(event->{
            /*
            We need the file chooser to create a file and select it to write
            back our contents on the textArea
            */
            FileChooser filech = new FileChooser();
            File fileselected = filech.showSaveDialog(primaryStage);
            // To create a file and save it using GUI, we need to use saveDialog
            if(fileselected != null){
                try {
                    Writer sc = new FileWriter(fileselected.getAbsoluteFile());
                    String temp = textEditor.getText(); // this will return all the
                    // texts from editor to temp
                    sc.write(temp);
                    sc.close();
                    
                } catch (FileNotFoundException ex) {
                    lbl1.setText(ex.getMessage());
                } catch (IOException ex){
                    lbl1.setText(ex.getMessage());
                }
            }
            
        });
        
        closeItem.setOnAction(event->{
            primaryStage.close();// this will close the GUI
        });
        
        /*
        Once all our event handlers are added properly, we now need to add them
        all with their menuItems to the main menu, which is file
        */
        fileMenu.getItems().addAll(openItem, saveItem, closeItem);
        textMenu = new Menu("View");// our 2nd menu bar item
        
        blackitem = new RadioMenuItem("Black");
        reditem = new RadioMenuItem("Red");
        blueitem = new RadioMenuItem("Blue");
        greenitem = new RadioMenuItem("Green");
        checkitem = new CheckMenuItem("Visible");
        /*
        By default, we want our black Item to be selected.
        */
                
        blackitem.setSelected(true);
        checkitem.setSelected(true);
        /*
        As we are using the RadioButtom MenuItems, we need to use ToggleGroup
        so that they can toggle among themselves
        */
        ToggleGroup textEdit = new ToggleGroup();
        blackitem.setToggleGroup(textEdit);
        reditem.setToggleGroup(textEdit);
        blueitem.setToggleGroup(textEdit);
        greenitem.setToggleGroup(textEdit);
        
        /*
        Now we need to add event handler to each of the radioButton and checkMenu
        Item one after another
        */
        blackitem.setOnAction(event ->{
            textEditor.setStyle("-fx-text-fill: black");
            /*
            this is the CSS style of GUI. We didn't do much of CSS with GUI.
            Only this style will be added. And this will change the appearance
            of the TextArea to Black
            */
                    
        });
        
        reditem.setOnAction(event ->{
            textEditor.setStyle("-fx-text-fill: red");
        });
        
        blueitem.setOnAction(event ->{
            textEditor.setStyle("-fx-text-fill: blue");
        });
        
        greenitem.setOnAction(event->{ 
            textEditor.setStyle("-fx-text-fill: green");
        });
        
        checkitem.setOnAction(event ->{ 
            /*
            here we are going to see whether the check item is selected or not
            if selected, then we will visible the textArea, otherwise not
            */
            if(textEditor.isVisible())
                textEditor.setVisible(false);
            else 
                textEditor.setVisible(true);
        });
        
        /*
        Once we are done with adding all the events to the buttons, now we need to add 
        all the items one after another to put them together.
        */
        textMenu.getItems().add(blackitem);
        textMenu.getItems().add(reditem);
        textMenu.getItems().add(blueitem);
        textMenu.getItems().add(greenitem);
        textMenu.getItems().add(new SeparatorMenuItem()); // This line will add
        // a seperator to our menu lists
        textMenu.getItems().add(checkitem);
        /*
        We now need to add all the menus we created to our menubar. To add all
        the menus together, we need to do the following code.. getMenus() will
        help to add the menus to our program GUI
        */
        menubar.getMenus().add(fileMenu);
        menubar.getMenus().add(textMenu);
        /*
        Once we created the menubar properly, we need one layout on which we can
        add the menubar and other items properly.
        
        Here, we are going to use BorderPane
        */
        
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(menubar); // we are going to pass out menubar at the
        // top position of the GUI
        borderpane.setCenter(vbox);
        
        Scene scene = new Scene(borderpane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /*
    In our draft menu design, we can see that, two types of menus are present
    one is FileMenu, another is TextMenu. We are going to create both of these menus
    along with their event handler inside a seperate method. The reason to do that
    is to keep the scope defined for all the the items properly.
    */
    
    private void buildFileMenu(Stage primaryStage){
        
    }
    
    /*
    now we need to create our textEditMenu
    */
    
    private void buildtextMenu(){
        
    
    }
    
}
