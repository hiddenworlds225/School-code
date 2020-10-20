/*
 * Made by Shawn Velsor
 * Date Created: September 7, 2020
 * 
 * Uses of math, strings, ints and doubles
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Addition
        int iAdd1 = 25;
        int iAdd2 = 9;
        double dAdd1 = 43.21;
        double dAdd2 = 3.14;
        System.out.println("Addition");
        System.out.println( iAdd1 + " + " + iAdd1 + " = " + (iAdd1 + iAdd2));
        System.out.println( dAdd1 + " + " + dAdd2 + " = " + (dAdd1 + dAdd2));
        System.out.println();
        
        // Subtraction
        int iSub1 = 11;
        int iSub2 = 9;
        int iSub3 = 25;
        
        double dSub1 = 3.14;
        double dSub2 = 10.0;
        
        System.out.println("Subtraction");
        System.out.println( iSub1 + " - " + iSub2 + " - " + iSub3 + " = " + (iSub1 - iSub2 - iSub3));
        System.out.println( "3.14 - 10.0 = " + (dSub1 - dSub2));
        System.out.println();
        
        // Multiplication
        int iMult1 = 25;
        int iMult2 = 9;
        
        double dMult1 = 3.14;
        double dMult2 = 10.0;
        
        System.out.println("Multiplication");
        System.out.println( iMult1 + " * " + iMult2 + " = " + (iMult1 * iMult2)); 
        System.out.println( dMult1 + " * " + dMult2 + " * "+ dMult2 + " = " + (dMult1 * dMult2 * dMult2));
        System.out.println();
        
        // Division
        int iDiv1 = 9;
        int iDiv2 = 25;
        
        double dDiv1 = 43.21;
        double dDiv2 = 10.0;
        
        System.out.println("Division");
        System.out.println( iDiv1 + " / " + iDiv2 +  " = " + (iDiv1 / iDiv2));
        System.out.println( dDiv1 + " / " +  dDiv2 + " = " + (dDiv1 / dDiv2));
        System.out.println();
         
        // Modulus operator
        int iMod1 = 11;
        int iMod2 = 9;
        
        double dMod1 = 10.0;
        double dMod2 = 3.14;
        
        System.out.println("Modulus");
        System.out.println( iMod1 + " % " + iMod2 + " = " + (iMod1 % iMod2));
        System.out.println( dMod1 + " % " + dMod2 + " = " + (dMod1 % dMod2));
        System.out.println();
        
        // 1.08 Additional int Equations
        int iNum1 = 20;
        int iNum2 = 5;
        int iNum3 = 7;
        
        System.out.println("Additional ints");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(iNum1 + " - " + iNum3 + " = " + (iNum1 - iNum3));
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println();
        
        // 1.09 Additional double Equations
        double dNum1 = 20.0;
        double dNum2 = 3.0;
        double dNum3 = 50.0;
        double dNum4 = 2.5;
        
        System.out.println("Additional doubles");
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println(dNum3 + " / " + dNum2 + " = " + (dNum3 / dNum2));
        System.out.println(dNum1 + " * " + dNum4 + " / "+ dNum2 + " = " + (dNum1 * dNum4 / dNum2));
        System.out.println();
    } // end of main method
} // end of class

