/*
    5.02 Using Static methods

    Purpose: Understand how static methods work and utilize them.

    Author @Shawn Velsor
    Date @12/16/2020
*/
import java.text.DecimalFormat;

class PlanetGravity
{
    public static void main(String[] args) 
    {
        

        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Saturn", "Neptune"};
        double[] size = {4880.0, 12103.6, 12756.3, 6794.0, 142984.0, 120536.0, 51118.0, 49532.0};
        double[] mass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};

        if(names.length != size.length || names.length != mass.length)
        {
            System.out.println("Arrays are not equal, you either have too much or to little of an array");
            System.exit(0);
        }


        

        System.out.println("\t\tPlanetary Data");
        System.out.println("-------------------------------------------");
        System.out.println("Name | Diameter(km) | Mass(kg) | g(m/s^2)");

        for(var i = 0; i < names.length; i++)
        {
            PrintInfo(names[i], size[i], mass[i]);

        }
    }

    public static double GetGrav( double size, double mass) 
    {
        double r = (size * 1000) / 2;
        return (6.67e-11 * mass) / Math.pow(r, 2);
    }

    public static void PrintInfo(String name, double size, double mass)
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.print(name);
            System.out.print(" | " + df.format(size));
            System.out.print(" | " + mass);
            System.out.println(" | " + df.format(GetGrav(size, mass)));
    }
}