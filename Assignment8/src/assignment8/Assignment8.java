/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class Assignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        Student[] students = new Student[7];
        File filename = new File("section0078.txt");
        Scanner sc = new Scanner(filename);
        int count = 0;
        while(sc.hasNext()){
            double[] marks = new double[6];
            String Name = sc.nextLine();
                    
            //System.out.println(Name);
            int id = Integer.parseInt(sc.nextLine());
            //System.out.println(id);
            for(int i = 0; i < 6; i++){
                marks[i] = Double.parseDouble( sc.next());
                System.out.println(marks[i]);
            }
            sc.nextLine();
            students[count] = new Student(Name, id, marks);
            count++;
        }
        
        System.out.println("Enter the selection 1 ~ 4");
        System.out.println("Enter 1 for ascending order by ID");
        System.out.println("Enter 2 for descending order by ID");
        System.out.println("Enter 3 for Ascending order by Average");
        System.out.println("Enter 4 for Descending order by Average");
        
        Scanner sc2 = new Scanner (System.in);
        int choice = sc2.nextInt();
        
        switch(choice){
            case 1:
                students = getAscnSortedById(students);
                break;
            case 2:
                students = getDescSortedById(students);
                break;
            case 3:
                students = getAscnSorted(students);
                break;
            case 4:
                students = getDescSorted(students);
                
        }
        /// printing the sorted students
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getID());
        }
            
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    
    public static Student[] getAscnSorted(Student[] students){
        
        for(int i = 0; i < students.length; i++)
        {
            double highest = students[i].getAverage();
            int index = i;
            
            for(int j = i; j < students.length; j++){
                if(highest < students[j].getAverage()){
                    highest = students[j].getAverage();
                    index = j;
                }
            }
            Student temp = students[i];
            students[i] = students[index];
            students[index] = temp;
        }
        return students;
    }
    public static Student[] getDescSorted(Student[] students){
        
        for(int i = 0; i < students.length; i++)
        {
            double highest = students[i].getAverage();
            int index = i;
            
            for(int j = i; j < students.length; j++){
                if(highest > students[j].getAverage()){
                    highest = students[j].getAverage();
                    index = j;
                }
            }
            Student temp = students[i];
            students[i] = students[index];
            students[index] = temp;
        }
        return students;
    }
    public static Student[] getAscnSortedById(Student[] students){
        
        for(int i = 0; i < students.length; i++)
        {
            double highest = students[i].getID();
            int index = i;
            
            for(int j = i; j < students.length; j++){
                if(highest < students[j].getID()){
                    highest = students[j].getID();
                    index = j;
                }
            }
            Student temp = students[i];
            students[i] = students[index];
            students[index] = temp;
        }
        return students;
    }
    
    public static Student[] getDescSortedById(Student[] students){
        
        for(int i = 0; i < students.length; i++)
        {
            double highest = students[i].getID();
            int index = i;
            
            for(int j = i; j < students.length; j++){
                if(highest > students[j].getID()){
                    highest = students[j].getID();
                    index = j;
                }
            }
            Student temp = students[i];
            students[i] = students[index];
            students[index] = temp;
        }
        return students;
    }
    
}
