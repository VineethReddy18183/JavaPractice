
import java.util.*;
public class Temperature {
    public static void main(String args[])
    {
        double noon = 77;          
        double evening = 61;       
        double midnight = 55;
        double convtempNoon = TempConv(noon);
        PrintTemp(noon,convtempNoon);

        double convtempEven = TempConv(evening);
        PrintTemp(evening,convtempEven);

        double convtempMid = TempConv(midnight);
        PrintTemp(midnight,convtempMid);



    }
    public static double TempConv(double F)
    {
        double C = (F-32)*((double)5/9);
        return C;
    }
    public static void PrintTemp(double temp,double convtemp)
    {
        System.out.println("Temperature in Fahrenheit: " + temp);
        System.out.println("Temperature in Celsius: "+ convtemp);
    }
    
}
