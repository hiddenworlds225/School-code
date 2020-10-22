import java.util.Arrays;
import java.util.Scanner;

/*
    @Author: Shawn Velsor
    Date: 10/20/2020

    Purpose: To get BMI


*/

public class Main 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] heightImperial;
        float metersTall;
        String firstName;
        String lastName;

        
        System.out.print("Welcome, please enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();

        System.out.print("Please enter your height ( feet,inches )");
        String heightRaw = scan.next();
        String[] heightRawArr;
        heightRaw = heightRaw.replaceAll("\\s", "");
        
        //Yhea, this is a very complicated line, but it works.
        heightImperial = Arrays.stream(heightRaw.split(",")).mapToInt(Integer::parseInt).toArray(); 

         heightImperial[0]

        //Quick Maths

        System.out.println(firstName);
        System.out.println(lastName);
        scan.close();
    }
    
}

