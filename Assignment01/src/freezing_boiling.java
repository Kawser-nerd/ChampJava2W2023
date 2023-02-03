/*
The attached table lists the freezing and boiling points of several substances in Fahrenheit:

Design a class that stores a temperature in a temperature field and has the appropriate
accessor and mutator methods for the field. The class should also have the following methods:

isEthylFreezing. This method should return the boolean value true if the temperature
stored in the temperature field is at or below the freezing point of ethyl alcohol. Otherwise,
the method should return false.

isEthylBoiling. This method should return the boolean value true if the temperature
stored in the temperature field is at or above the boiling point of ethyl alcohol. Otherwise, the
method should return false.

isOxygenFreezing. This method should return the boolean value true if the temperature
stored in the temperature field is at or below the freezing point of oxygen. Otherwise, the
method should return false.

isOxygenBoiling. This method should return the boolean value true if the temperature
stored in the temperature field is at or above the boiling point of oxygen. Otherwise, the
method should return false.

isWaterFreezing. This method should return the boolean value true if the temperature
stored in the temperature field is at or below the freezing point of water. Otherwise, the
method should return false.

isWaterBoiling. This method should return the boolean value true if the temperature
stored in the temperature field is at or above the boiling point of water. Otherwise, the
method should return false.

Write a program that demonstrates the class. The program should ask the user to enter a
temperature, then display a list of the substances that will freeze at that temperature and those that will boil at
that temperature. For example, if the temperature is -20, the class should report that water will freeze and oxygen \
will boil at that temperature.
 */
public class freezing_boiling {
    private float temperature;
    public freezing_boiling(float temperature){
        this.temperature = temperature;
    }

    public boolean isEthyFreezing(){
        if(this.temperature <= -173)
            return true;
        else
            return false;
    }
    public boolean isEthyBoiling(){
        if(this.temperature >= 172)
            return true;
        else
            return false;
    }
    public boolean isOxygenFreezing(){
        if(this.temperature <= -362)
            return true;
        else
            return false;
    }
    public boolean isOxygenBoiling(){
        if(this.temperature >= -306)
            return true;
        else
            return false;
    }
    public boolean isWaterFreezing(){
        if (this.temperature <= 32)
            return true;
        else
            return false;
    }
    public boolean isWaterBoiling(){
        if(this.temperature >= 212)
            return true;
        else
            return false;
    }



}
