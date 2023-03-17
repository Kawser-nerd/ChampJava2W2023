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
public class JuniorExecutive extends SalaryException implements EmployeeSalary{
    private double totalSalary;

    
    public void addEmplySalary(double salary) {
        try{
            if(salary < 40000 || salary >10000000) throw new SalaryException();
            salary = salary - salary * 0.25;
            totalSalary+= salary;
        }catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        } catch (SalaryException ex) {
            Logger.getLogger(JuniorExecutive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double calculateSalary() {
        return totalSalary;
    }
    
}
