import java.util.Arrays;
import java.util.Scanner;

/*
    @Author: Shawn Velsor
    Date: 10/20/2020

    Purpose: To get BMI


*/

public class BMI
{

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] heightImperial;
        double metricHeight;
        String firstName;
        String lastName;
        double weightImperial;
        double weightMetric;
        double BMI;
        
        System.out.print("Welcome, please enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();

        System.out.print("Please enter your height ( feet,inches ) ");
        String heightRaw = scan.next();
        heightRaw = heightRaw.replaceAll("\\s", "");

        System.out.print("What is your weight in Pounds(lb)? ");

            weightImperial = scan.nextDouble();
        
        //Yhea, this is a very complicated line, but it works.
        heightImperial = Arrays.stream(heightRaw.split(",")).mapToInt(Integer::parseInt).toArray(); 

         

        //Quick Maths

        metricHeight = (( 12.0 * heightImperial[0]) + heightImperial[1]) * 2.54;
        //idk if rounding is bad, but it doesn't look bad.
        metricHeight = Math.round(metricHeight / 100.0);
        weightMetric = Math.round(weightImperial / 2.205);
        BMI = weightMetric / Math.pow(metricHeight, 2);

        //Do the if statements
        System.out.println("===BMI Calculator===");
        System.out.println("Name: "+ firstName + " " + lastName);
        System.out.println("Weight (kg): " + weightMetric);
        System.out.println("Height (m): " + metricHeight);
        System.out.print("Status: ");

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (18.5 >= BMI && BMI <= 24.9 )
            System.out.println("Normal weight.");
        else if (25.0 >= BMI && BMI <= 29.9)
            System.out.println("Overweight.");
        else if (BMI >= 29.9)
            System.out.println("Obese.");

        
        scan.close();
    }
    
}

