/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventcontrollertest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author knafi
 */
public class ButtonClickEvent implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
        System.out.println("The button is clicked");
        
    }
    
}
