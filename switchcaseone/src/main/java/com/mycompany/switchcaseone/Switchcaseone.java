/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switchcaseone;

/**
 *
 * @author knafi
 */
import java.util.Scanner;
public class Switchcaseone {

    public static void main(String[] args) {
        System.out.println("Enter Marks:");
        Double marks;
        int value = 0;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextDouble();
        /*
        if(marks>=90)
            value = 1;
        else if (marks>=80 && marks <=89)
            value = 2;
        else if (marks>=70 && marks <=79)
            value = 3;
        else if (marks>=60 && marks <=69) 
            value = 4;
        */
        
        value = (int) (marks / 10);
        
                
        switch(value){
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
           case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
                break;
                
        }
    }
}
