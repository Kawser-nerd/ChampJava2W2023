/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewprogramone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author knafi
 */
public class Executive extends SalaryException implements EmployeeSalary{
    private double totalSalary =0;

    public void addEmplySalary(double salary) {
        if (salary < 40000 || salary >1000000){
            try {
                throw new SalaryException();
            } catch (SalaryException ex) {
                Logger.getLogger(Executive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        totalSalary+= salary;
    }

    public double calculateSalary() {
        return totalSalary;
        
    } 
}
