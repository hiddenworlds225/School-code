
/**
 * GradesV2
 * 
 * This program gets all test scores, combines them, and 
 * prints the correct format has needed.
 *
 * @author Shawn Velsor
 * @version 9/21/2020
 */
public class Gradesv2
{
    public static void main()
    {
        
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        //Test Details
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        //output is close enough to desired print
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        //Test Details
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        //Test Details
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        //Test Details
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        //Test Details
        numTests++;
        testGrade = 16;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        //Test Details
        numTests++;
        testGrade = 100;
        totalPoints += testGrade;
        average = (totalPoints / numTests);
        
        System.out.print("Test # " + numTests + "\t");
        System.out.print("Test Grade: " + testGrade + "\t");
        System.out.print("Total Points: " + totalPoints + "\t");
        System.out.println("Average Grade: " + average);
        
        /*Too repetitive and inconvienient. Next time, I'll just make them
        *pass through another void to make it cleaner and faster to modify
        *since its all the same.
        */
    }
}
