/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.chain;

/**
 *
 * @author knafi
 */
public class passFailActivity extends GradedActivity{
    private boolean passFail;
    
    public void setPassFail(double marks){
        if(marks < 60)
            this.passFail = false;
        else
            this.passFail = true;
    }
    
    public boolean getPassFail(){
        return this.passFail;
    }
    
}
