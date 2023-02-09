/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author knafi
 */
public class Address {
    private String cityName;
    private String roadName;
    private int Aprtname;
    // Intialize the city Name variable //
    public void setCityName(String cityName){
        /// Here, we are sending the values to put it in the CityName variable
        this.cityName = cityName;
    }
    /// Mutators
    public void setRoadName(String roadName){
        this.roadName = roadName;
    }
    
    public void setAprtName (int AprtName){
        this.Aprtname = AprtName;
    }
    
    /// Accessors
    public String getCityName(){
        return this.cityName;
    }
    
    public String getRoadName(){
        return this.roadName;
    }
    
    public int getAprtName(){
        return this.Aprtname;
    }
    
}
