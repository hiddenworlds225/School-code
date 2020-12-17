
/**
 * APCS Team
 *
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String[] args) throws IOException
    {
        //initialize scanner
        Scanner in = new Scanner(System.in);

        File file = new File("passcodes.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.flush();
        
        //declare and initialize variables
        int userChoice = 0;
        int pwLength = 0;
        String password = "";
        boolean isLooping = true;

        while(isLooping)
        {
            //password generator menu
            System.out.println("Password Generator");
            System.out.println("==============================================================");
            System.out.println("  [1] Only lowercase Letters    ");
            System.out.println("  [2] Only Uppercase Letters    ");
            System.out.println("  [3] Only Numerical Numbers    ");             
            System.out.println("  [3] Alphanumerical Password   ");
            System.out.println("  [5] Quit                      ");
            System.out.println("==============================================================");
     
            System.out.print("Please select a menu item: ");
            userChoice = in.nextInt();

            
         

            if(userChoice >= 1 && userChoice <= 5)
            {
                if(userChoice != 5)
                {
                    System.out.print("Please give a desired length (6 or more): ");
                    pwLength = in.nextInt();

                    while(pwLength < 6)
                    {
                        System.out.print("Invalid input, required value is 6 or greater: ");
                        pwLength = in.nextInt();
                    }
                }

                System.out.println("");

                password = "";
                int randNum = 0;
                Random randNumList = new Random();

                // loop for password length
                if(userChoice == 1)
                {
                    
                    int i = 0;
                    while(pwLength > i)
                    {
                        randNum = randNumList.nextInt(128);
                        if(randNum > 96 && randNum < 123)
                        {
                        password += (char)(randNum);
                        i++;
                        }
                    }
                    writer.println(password);
                }

                if(userChoice == 2)
                {
                    int i = 0;
                    while(pwLength > i)
                    {
                        randNum = randNumList.nextInt(128);
                        if( randNum > 64 && randNum < 91)
                        {
                            password += (char)(randNum);
                            i++;
                        }
                    }
                    writer.println(password);
                }

                if(userChoice == 3)
                {
                    int i = 0;
                    while(pwLength > i)
                    {
                        randNum = randNumList.nextInt(128);
                        if(randNum > 47 && randNum < 58)
                        {
                            password += (char)(randNum);
                            i++;
                        }
                    }
                    writer.println(password);
                }

                if(userChoice == 4)
                {
                    int i = 0;
                    while(pwLength > i)
                    {
                        randNum = randNumList.nextInt(128);
                        if((randNum >= 48 && randNum <= 57) || (randNum >= 65 && randNum <= 90) 
                        || (randNum >= 97 && randNum <= 122))
                        {
                            password += (char)(randNum);
                            i++;
                        }
                    }
                    writer.println(password);
                }

                if(userChoice == 5)
                {
                    isLooping = !isLooping;
                }
            }

        }
        in.close();
        writer.close();

        //reading from file

        System.out.println("Thank you for using PasswordGenerator\u2122!\n");

        Scanner scanFile = new Scanner(file);

        int x = 1;
        while(scanFile.hasNext())
        {
            System.out.println(x + ". " + scanFile.next()+ "\n");
            x++;
        }

        scanFile.close();
        
    }
}

