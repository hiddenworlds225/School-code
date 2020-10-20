
/**
PROJECT TITLE: 2.03 Math
PURPOSE OF PROJECT: Learning how to use the Java Math Module
VERSION or DATE: 10/1/2020 
AUTHOR: Shawn Velsor 
************************** PMR***********************************
<+s>: Very easy to complete math wise. 
<-s>: Didn't realaize that variables must be add inside static functions.
      Did the opposite. Fixed just by moving the variables back into them
******************************************************************************* 
In the future: 
    Add variables to static when necessary.
 */
public class PyTheorem
{
    public static void main(String[] args)
    {
        //get variables
        double side11 = Math.random(5, 23;
        double side12 = 13;
        double hypotenuse1 = 0.0;
        double side21 = 15;
        double side22 = 12;
        double hypotenuse2 = 0.0;
        //do math
        hypotenuse1 = Math.sqrt(Math.pow(side11,2) + Math.pow(side12,2));
        hypotenuse2 = Math.sqrt(Math.pow(side21,2) + Math.pow(side22,2));
        //print out
        System.out.println("Triangle 1:\tSide1: " + side11 + "\tSide 2: " +
        side12 + "\tHypotenuse: " + hypotenuse1);
        
        System.out.println();
        
        System.out.println("Triangle 2:\tSide1: " + side21 + "\tSide 2: " +
        side22 + "\tHypotenuse: " + hypotenuse2);
    }
}
