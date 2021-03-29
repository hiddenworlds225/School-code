package Extras;

/**
 * Annual Weather description: Annual Weather for Jacksonville, FL
 * 
 * @author Shawn Velsor
 * @version 1/11/2021
 *
 */
import java.util.Scanner;

public class AnnualWeatherV2
{

    //Used mathHandler in order to make it simpler
    public static double averageTemp(double[] temperature, String tChoice) {
        double total = 0.0;
        for( int index = 0; index < temperature.length; index++)
        {
                total += mathHandler(temperature, index, tChoice);
        }
        return total / temperature.length;
    }
    
    // Using mathHandler to simplify system
    public static double totalPrecip(double[] precip, String pChoice) {
        double total = 0;
        for(int i = 0; i < precip.length; i++){

            total += mathHandler(precip, i, pChoice);
        }
        return total;
    }

    public static void printResults(String city, String state, String[] month, double[] temp, double[] precip, String tChoice, String pChoice){
        // Output: display table of weather data including average and total
        System.out.println();
        System.out.printf("%20s %n", "Weather Data");
        System.out.printf("Location: %s, %s%n",city, state);
        System.out.println();
        System.out.printf("Month     Temperature (\u00B0%s))     Precipitation (%s.) %n", tChoice.toUpperCase(), pChoice);
        System.out.println("***************************************************");

        //Gets data to format per line
        for(int i = 0; i < month.length; i++){
            System.out.printf("%s:\t\t%3.2f\t\t%3.2f%n",month[i], mathHandler(temp, i, tChoice)  , mathHandler(precip, i, pChoice));
        }
        System.out.printf("Average Temp: %3.2f\tTotal Precip: %3.2f %n", averageTemp(temp, tChoice), totalPrecip(precip, pChoice));
    }
        

    // Since the numbers are already formatted as Inches and °F, just use this to convert.
    // Called MathHandler because of the math used to handle conversion.
    public static double mathHandler(double[] arr, int arrIndex, String conversionType){
        double convertedDouble;

        //temp
        if(conversionType.equals("c")){
            convertedDouble = (arr[arrIndex] - 32) * 5/9;
        }
        //Precip
        else if(conversionType.equals("cm")){
            convertedDouble = arr[arrIndex] * 2.54;
        }
        else{
            return arr[arrIndex];
        }

        return convertedDouble;
    }
   
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Jacksonville";
        String state = "Florida";
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        double [] temperature ={53.1, 55.8, 61.6, 66.6 ,73.4, 79.1, 81.6, 80.8, 77.8, 69.4, 61.7, 55.0};
        double [] precipitation ={3.7, 3.2, 3.9, 3.1, 3.5, 5.4, 6.0, 6.9, 7.9, 3.9, 2.3, 2.6};
        
        String tempChoice = "";
        String precipChoice = "";

        //Check temp measure
        System.out.print("Hello, do you want your temperature to be in \u00B0F or \u00B0C? (F/C) ");
        tempChoice = in.nextLine();
        while(!tempChoice.equalsIgnoreCase("f") || !tempChoice.equalsIgnoreCase("c")){

            //Use a catch handler, this is something I need to figure out in the future
            // ISSUE: I need to use the catch handler in order to exit the loop on a correct key.
            if(tempChoice.equalsIgnoreCase("f") || tempChoice.equalsIgnoreCase("c")){
                break; 
            }

            System.out.print("Not a correct type, please choose F or C ");
            tempChoice = in.nextLine();
        }

        //Check precip measure
        System.out.print("Do you want your temperature to be in cm or in? ");
        precipChoice = in.nextLine();
        while(!precipChoice.equalsIgnoreCase("in") || !precipChoice.equalsIgnoreCase("cm")){
            if(precipChoice.equalsIgnoreCase("in") || precipChoice.equalsIgnoreCase("cm")){
                break; 
            }
            System.out.print("Not a correct type, please choose in or cm ");
            precipChoice = in.nextLine();
        }

        //Just pass through to the choices
        //So many variables ha
        printResults(city, state, month, temperature, precipitation, tempChoice.toLowerCase(), precipChoice.toLowerCase());
        in.close();
    }
}
