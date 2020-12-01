/*
    Learning how to write to files

    @Shawn Velsor
    12/1/2020


*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class AnimalPopultaion {
    
    public static void main(String[] args) throws IOException{

        PrintWriter outFile = new PrintWriter(new File("interger.txt"));
        Scanner input = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        Random rand = new Random();
        int num = 0;
        //Used to count how many fox squirrels
        int fsc = 1;

        //Flush file if necessary, can be commented out.
        outFile.flush();

        System.out.println("Welcome to Fox Squirrel Simulator\n\n");
        System.out.print("How many trials should we conduct? (Minimum 1000): ");
        int trials = input.nextInt();

        while(trials < 1000){
            System.out.print("That is less than recommended, please type a number greater than 1000: ");
            trials = input.nextInt();
        }

        input.close();
        System.out.println("Running Simulation...");

        for(var i = 0; i < trials; i++){
            num = rand.nextInt(10) + 1;
            outFile.println(num);

            if(num == 10){
                fsc++;
            }

            System.out.println(dec.format(((double)i / trials) * 100) + "%");

        }

        System.out.println("Simulation complete!\n\n");
        System.out.println("Average Fox Squirell count: " + (dec.format((double) trials / fsc)));

        outFile.println("Total seen: " + fsc);
        outFile.println("Average Fox Squirell count: " + (dec.format((double) trials/ fsc)));

        outFile.close();    //close the file when finished



    }
}
