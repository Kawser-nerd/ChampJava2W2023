/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package review;

/**
 *
 * @author knafi
 */
import java.util.Scanner;
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double value1;
        double value2;
        int choice;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        value1 = sc.nextDouble();
        
        System.out.println("Enter 2nd number");
        value2 = sc.nextDouble();
        
        System.out.println("Enter your choice:");
        System.out.println("Enter 1 for adding these values");
        System.out.println("Enter 2 for substracting these values");
        System.out.println("Enter 3 for multiplying these values");
        System.out.println("Enter 4 for dividing these values");
        System.out.println("Enter 5 for comparing these values");
        System.out.println("Enter 6 for incrementing these values by 5");
        System.out.println("Enter 7 for decrementing these values by 5");
        System.out.println("Enter 8 for exit");
        
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                addition add = new addition(value1, value2);
                System.out.println("The addition: "+ add.getAddition());
                break;
            case 2:
                substraction sub = new substraction();
                sub.setValue1(value1);
                sub.setValue2(value2);
                System.out.println("The substraction: "+ sub.getSubstract());
                break;
            case 3:
                multiplication mul = new multiplication(value1, value2);
                System.out.println("The multiplication "+ mul.getMultiplication());
                break;
                
            case 4:
                division div = new division(value1, value2);
                System.out.println("The division "+ div.getDivision());
                break;
                
            case 5:
                comparispon comp = new comparispon(value1, value2);
                System.out.println(comp.getComparisonResult());
                break;
            
            case 6:
                increament inc = new increament();
                inc.setValue1(value1);
                inc.setValue2(value2);
                System.out.println("First Variable "+ inc.getValue1() + '\n' + "Second Variable "+ inc.getValue2());
                break;
            
            case 7:
                decrement dec = new decrement(value1, value2);
                System.out.println("First Variable "+ dec.getValue1() + '\n' + "Second Variable "+ dec.getValue2());
                break;
            default:
                System.out.println("You put wrong choice");
        }
        
        
        
    }
    
}
