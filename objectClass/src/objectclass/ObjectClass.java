/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectclass;

/**
 *
 * @author knafi
 */
public class ObjectClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        rectangle r2 = rectangle.getconstructor();
        System.out.println(r2.toString());
        //r2.setHeight(12);
        //r2.setLength(14);
        
        System.out.println("Regular Obeject Lenght "+ r2.getLength());
        System.out.println("Regular Obeject Height "+ r2.getHeight());
        
        r2.setObject(r2);
        
        rectangle r3 = r2.getObject();
        System.out.println("passing object Lenght "+ r3.getLength());
        System.out.println("passing Obeject Height "+ r3.getHeight());
        
        if(r2==r3){
            System.out.println("Equal");
        }
    }
    
}
