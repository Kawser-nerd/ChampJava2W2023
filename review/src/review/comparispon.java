/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review;

/**
 *
 * @author knafi
 */
public class comparispon {
    private double value1;
    private double value2;

    comparispon(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public String getComparisonResult(){
        if(value1 == value2){
            return "The given values are equal to each other";
        }
        else{
            if(value1 > value2 ){
                return "This "+ value1 + " is greater than " + value2; 
            }
            else{
                return "This "+ value2 + " is greater than " + value1;
            }
        }
    }
}
