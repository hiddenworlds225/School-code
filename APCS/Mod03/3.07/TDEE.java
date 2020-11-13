/*
    Project: 3.07 Logical operators
    Date: 11/10/2020
    Author: Shawn Velsor



*/
import java.util.Scanner;

public class TDEE
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name;
        int bmr;
        String gender;
        String activity;
        double aFactor = 0.0;
        double tdee;


        System.out.print("What is your name? (First Last): ");
        name  = in.nextLine();

        System.out.print("What is your BMR? ");
        bmr = in.nextInt();

        System.out.print("What is your gender? M/F: ");
        gender = in.next();

        System.out.println("Select Activity Level:\n" +
        "[A] Resting (Sleeping, Reclining)\n" +
        "[B] Sedentary (watching TV, reading)\n" + 
        "[C] Light (walking, laundry)\n" + 
        "[D] Moderate (dancing, cycling, gardening)\n" + 
        "[E] Very Active (team sports, climbing, agricultural labor)\n" + 
        "[F] Extremely Active (full-time athletes, construction workers)");

        System.out.print("Pick the corresponding letter: ");
        activity = in.next();



        if(activity.toLowerCase() == "a")
        {
            aFactor = 1.0;
        }
        if(activity.toLowerCase() == "b")
        {
            aFactor = 1.3;
        }
        if(activity.toLowerCase() == "c")
        {
            if(gender.toLowerCase() == "m")
            {
                aFactor = 1.6;
            }
            else
            {
                aFactor = 1.5;
            }
        }
        if(activity.toLowerCase() == "d")
        {
            if(gender.toLowerCase() == "m")
            {
                aFactor = 1.7;
            }
            else
            {
                aFactor = 1.6;
            }
        }
        if(activity.toLowerCase() == "e")
        {
            if(gender.toLowerCase() == "m")
            {
                aFactor = 2.1;
            }
            else
            {
                aFactor = 1.9;
            }
        }
        if(activity.toLowerCase() == "f")
        {
            if(gender.toLowerCase() == "m")
            {
                aFactor = 2.4;
            }
            else
            {
                aFactor = 2.2;
            }
        }


        tdee = (double) bmr * aFactor;


        System.out.println("");
        System.out.println("Results:");
        System.out.println("Name: " + name + "\t Gender: " + gender.toUpperCase());
        System.out.println("BMR: " + (double) bmr + "\t Activity Factor: " + aFactor);
        System.out.println("TDEE: " + tdee);

        in.close();
    }

}