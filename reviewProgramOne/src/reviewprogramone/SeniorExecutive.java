/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewprogramone;

/**
 *
 * @author knafi
 */
public class SeniorExecutive implements EmployeeSalary{
    private double totalSalary = 0;

   
    public void addEmplySalary(double salary) {
        try{
            salary = salary * 0.15 + salary;
            totalSalary+= salary;
        }catch(NumberFormatException  ex){
            System.out.println(ex.getMessage());
        }
    }
   
    public double calculateSalary() {
        return totalSalary;
    }
    
}
