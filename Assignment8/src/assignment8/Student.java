/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

/**
 *
 * @author knafi
 */
public class Student {
    String Name;
    int id;
    double[] marks = new double[6];
    double average;
    double total;
    public Student(String Name, int id, double[] marks){
        this.Name =Name;
        this.id = id;
        this.total = 0;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = marks[i];
            total+=this.marks[i];
        }
        this.average = total/6;
    }
    
    public String getName(){
        return this.Name;
    }
    public int getID(){
        return this.id;
    }
    public double getAverage(){
        return this.average;
    }
    public double getTotal(){
        return this.total;
    }
    
}
