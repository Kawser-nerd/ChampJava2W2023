import java.util.Scanner;

public class driver {
    public static void main(String []args){
        System.out.println("Enter the temperature you are looking for");
        boolean response = true;
        Scanner sc = new Scanner(System.in);
        freezing_boiling fb = new freezing_boiling(sc.nextFloat());
        response = fb.isEthyFreezing();
        if (response)
            System.out.println(" Ethyl alcohol is freezing");
        else
            System.out.println(" Ethyl alcohol is not freezing");
        response = fb.isEthyBoiling();
        if (response)
            System.out.println(" Ethyl alcohol is boiling");
        else
            System.out.println(" Ethyl alcohol is not boiling");
        response = fb.isOxygenFreezing();
        if (response)
            System.out.println(" Oxygen is freezing");
        else
            System.out.println(" Oxygen is not freezing");
        response = fb.isOxygenBoiling();
        if (response)
            System.out.println(" Oxygen is boiling");
        else
            System.out.println(" Oxygen is not boiling");
        response = fb.isWaterFreezing();
        if (response)
            System.out.println(" Water is freezing");
        else
            System.out.println(" Water is not freezing");
        response = fb.isWaterBoiling();
        if (response)
            System.out.println(" Water is boiling");
        else
            System.out.println(" Water is not boiling");
    }
}
