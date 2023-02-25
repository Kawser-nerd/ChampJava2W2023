/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacing;

/**
 *
 * @author knafi
 */
public interface testInterface1 extends interfaceSuper1, InterfaceSuper2{
    int value = 1; // final static, the value can only be reused inside other class
    int getIncrementedNumber();
    
}
