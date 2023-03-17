/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaclassexample;

import java.util.Scanner;

/**
 *
 * @author knafi
 */
public class nestedloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int input;
        
        System.out.println("Enter row number for pyramid");
        Scanner sc = new Scanner(System.in);
        
        input = sc.nextInt();
        
        // row number
        for(int i=1; i<=input; i++){
            
            //column number
            for(int j = 1; j<= i; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        System.out.print('\n');
        System.out.print('\n');
        System.out.print('\n');
        //row number
        for(int row=1; row<=input; row++){
            //column number
            for(int col=input; col>=row; col--){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        
        System.out.print('\n');
        System.out.print('\n');
        System.out.print('\n');
        //row number
        for(int row=input; row>=1; row--){ //outer loop
            //column number
            for(int col=1; col<=row; col++){ //inner loop
                System.out.print('*');
                break;
            }
            System.out.print('\n');
        }
    }
    
}
