/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectclass;

/**
 *
 * @author knafi
 */
public class rectangle {
    private double length;
    private double height;
    private rectangle r;
    
    rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setObject(rectangle r){
        this.r = r;
        this.r.setHeight(9.5);
        this.r.setLength(4.5);
    }
    
    public rectangle getObject(){
        return this.r;
    }
    
    public static rectangle getconstructor(){
        return new rectangle(12, 14);
    }
    
}
