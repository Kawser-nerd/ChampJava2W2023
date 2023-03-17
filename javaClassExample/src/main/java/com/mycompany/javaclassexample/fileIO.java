/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaclassexample;

/**
 *
 * @author knafi
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class fileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        /*
        PrintWriter fileoutput = new PrintWriter("test.txt");
        fileoutput.print("This is our first file example. ");
        fileoutput.println("We love java programming ");
        fileoutput.print("testing new lines !!!");
        fileoutput.close();*/
        
        File f = new File("C:\\Users\\knafi\\Documents\\henri.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
        String textinFile = sc.nextLine();
        System.out.println(textinFile);
        }
    }
    
}
