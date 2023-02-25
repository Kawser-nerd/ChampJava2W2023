/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ploymorphism2;

/**
 *
 * @author knafi
 */
public class Ploymorphism2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create instance for our Superclass but if it is abstract class, we
        // can only inherit it inside other classes, but can not create instances
        /*Shape s = new Shape();
        // to see which class are you now
        s.whereAmI();
        s.setArea(23, 12);
        System.out.println("Area of Shape " + s.getArea());
        */
        // Create instance for our Rectangle Class
        Rectangle rc = new Rectangle();
        rc.whereAmI();
        rc.setArea(22, 11);
        System.out.println("Area of Rectangle " + rc.getArea());
        
        // Create instance for our Square Class
        Square sc = new Square();
        sc.whereAmI();
        sc.setArea(22); // this method is overloading
        System.out.println("Area of Square " + sc.getArea());
        
        // Create instance for our Circle Class
        Circle cl = new Circle();
        cl.whereAmI();
        cl.setArea(22); // this method is overloading
        System.out.println("Area of Circle " + cl.getArea1());
        
        
    /// PolyMorphism
    
    System.out.println("Polymorphism");
    Shape sp = new Rectangle();
    sp.whereAmI();
    sp.setArea(22, 11);
    
    /*Shape sp1 = new Shape();
    sp1.whereAmI();
    sp1.setArea(20, 10);
    */
    System.out.println("Area for Rectangle Class " + sp.getArea());
    //System.out.println("Area for Space Class " + sp1.getArea());
    
    
    
   
        
    }
    
}
