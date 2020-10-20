import java.util.Scanner;

/*
    @Author: Shawn Velsor
    Date: 10/20/2020


*/

public class Main 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;



        
        
        //System.out.println("Hi");
        System.err.println("Hi");

        firstName = scan.nextLine();
        lastName = scan.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        scan.close();
    }
    
}

