/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacing;

/**
 *
 * @author knafi
 */
public class Interfacing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Incrementing inc1 = new Incrementing();
        testInterface1 inc = new Incrementing();/// class object type is interfacing type
        System.out.println(inc.getIncrementedNumber());
        inc.print1();
        inc.print2();
    }
    
}
