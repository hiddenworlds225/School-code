/**
 * Annual Weather description: Annual Weather for Jacksonville, FL
 * 
 * @author Shawn Velsor
 * @version 1/11/2021
 *
 */
// import java.util.Scanner;
public class AnnualWeatherV1
{

    public static double AverageTemp(double[] temperature) {
        double total = 0.0;
        for( int index = 0; index < temperature.length; index++)
        {
            total += temperature[index];
        }
        return total / temperature.length;
    }
    
    // method to calculate total precipitation array
    public static double TotalPrecip(double[] precip) {
        double total = 0;
        for(int i = 0; i < precip.length; i++){
            total += precip[i];
        }
        return total;
    }
    
    // method to print results (formatting output will be done in 6.02)
    public static void PrintResults(String city, String state, String[] month,double[] temp, double[] precip, String tempLabel, String precipLabel){
        // Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for(int i = 0; i < month.length; i++){
            System.out.println(month[i] + "\t" + temp[i] + "\t" + precip[i]);
        }
        System.out.println("Average: "+ AverageTemp(temp) + "    Total: " + TotalPrecip(precip));
    }
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    
   
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
       // Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Jacksonville";
        String state = "Florida";
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        double [] temperature ={53.1, 55.8, 61.6, 66.6 ,73.4, 79.1, 81.6, 80.8, 77.8, 69.4, 61.7, 55.0};
        double [] precipitation ={3.7, 3.2, 3.9, 3.1, 3.5, 5.4, 6.0, 6.9, 7.9, 3.9, 2.3, 2.6};
    
        String tempLabel = "F";
        String precipLabel = "in.";
        
        //input to decide F/C and in/cm - to be completed in 6.02
        
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02

        PrintResults(city, state, month, temperature, precipitation, tempLabel, precipLabel);
    }
}
