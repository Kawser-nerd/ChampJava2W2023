/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewprogramone;

/**
 *
 * @author knafi
 */
public class ReviewProgramOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double baseSalary = 50000;
        // TODO code application logic here
        Executive executive = new Executive();
        SeniorExecutive Snexecutive = new SeniorExecutive();
        JuniorExecutive jnExecutive = new JuniorExecutive();
        
        // 3 Executives
        executive.addEmplySalary(baseSalary);
        executive.addEmplySalary(baseSalary);
        executive.addEmplySalary(baseSalary);
        
        // 1 Senior Executive
        Snexecutive.addEmplySalary(baseSalary);
        
        // 4 Junior Executive
        jnExecutive.addEmplySalary(baseSalary);
        jnExecutive.addEmplySalary(baseSalary);
        jnExecutive.addEmplySalary(baseSalary);
        jnExecutive.addEmplySalary(baseSalary);
        
        // going to calculate total salary for all the employees in the organization
        double totalSalary = executive.calculateSalary() + Snexecutive.calculateSalary() +
                jnExecutive.calculateSalary();
        
        System.out.println("Total Expenditure of the Company: "+ totalSalary);
    }   
        
    
}
