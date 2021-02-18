package Hurricanes;
/**
 * Hurricane Tester, modified by Shawn Velsor
 * 2/15/2021
 *
 */
 
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester
{

    //Ran in VSCode, remove //NOSONAR if you are not using it.
    public static void main(String[] args) throws IOException //NOSONAR
    {
        //Hurricane years min-max
        

        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        int[] category = new int[numValues];
        // knots to mph is b = a * 1.151
        for(int i = 0; i < numValues; i++){
            windSpeeds[i] = windSpeeds[i] * 1.151;

            if(windSpeeds[i] > 74 && windSpeeds[i] < 95){
                category[i] = 1;
            }
            else if(windSpeeds[i] > 96 && windSpeeds[i] < 110){
                category[i] = 2;
            }
            else if(windSpeeds[i] > 111 && windSpeeds[i] < 129){
                category[i] = 3;
            }
            else if(windSpeeds[i] > 130 && windSpeeds[i] < 156){
                category[i] = 4;
            }
            else if(windSpeeds[i] > 157){
                category[i] = 5;
            }
        }
        
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricaneList = new ArrayList<>();
        for(int i = 0; i < index; i++){
            hurricaneList.add(new Hurricane(years[i], names[i], months[i], category[i], pressures[i], windSpeeds[i]));
        }
        
        //user prompted for range of years
        Scanner in = new Scanner(System.in);
        int minYearRange;
        int maxYearRange;
        System.out.print("Please give the minimum and maximum years for searching hurricanes (ex. 2005-2007): ");
        String[] input = in.nextLine().trim().split("-");

        in.close();
        
        if(Integer.parseInt(input[0]) < Integer.parseInt(input[1])){
            minYearRange = Integer.parseInt(input[0]);
            maxYearRange = Integer.parseInt(input[1]);

        }
        else{
            minYearRange = Integer.parseInt(input[1]);
            maxYearRange = Integer.parseInt(input[0]);

        }

        //All the variables to help with the min, max, and avg.
        int hurricaneCount = 0;

        int minPressure = Integer.MAX_VALUE;
        int maxPressure = Integer.MIN_VALUE;

        int minCat = Integer.MAX_VALUE;
        int maxCat = Integer.MIN_VALUE;

        double minWind = Double.MAX_VALUE;
        double maxwind = Double.MIN_VALUE;

        double catAvg = 0.0;
        double pressureAvg = 0.0;
        double windAvg = 0.0;

        //Print results of range.
        System.out.printf("%20s", "Hurricanes: " + minYearRange + "-" + maxYearRange + "%n");
        System.out.printf("%-10s%-10s%-10s%-15s%-10s", "Year", "Name", "Category", "Pressure (mb)", "Wind Speed (mph)%n");
        System.out.println("==============================================================");


        //print the data, also get final information.
        for(Hurricane hurricane : hurricaneList){
            if(hurricane.getYear() >= minYearRange && hurricane.getYear() <= maxYearRange){
                System.out.println(hurricane.toString());

                if(hurricane.getCat() < minCat){
                    minCat = hurricane.getCat();
                }
                if(hurricane.getCat() > maxCat){
                    maxCat = hurricane.getCat();
                }

                if(hurricane.getPressure() < minPressure){
                    minPressure = hurricane.getPressure();
                }
                if(hurricane.getPressure() > maxPressure){
                    maxPressure = hurricane.getPressure();
                }

                if(hurricane.getWindspeed() < minWind){
                    minWind = hurricane.getWindspeed();
                }
                if(hurricane.getWindspeed() > maxwind){
                    maxwind = hurricane.getWindspeed();
                }


                //Add to these variables.
                pressureAvg += hurricane.getPressure();
                windAvg += hurricane.getWindspeed();
                catAvg += hurricane.getCat();
                hurricaneCount++;
                
            }
        }
    
        System.out.println("==============================================================");
        System.out.printf("%18s%10.2f%12.2f%14.2f%n", "Average:", catAvg/ hurricaneCount, pressureAvg/hurricaneCount, windAvg/hurricaneCount);
        System.out.printf("%18s%7d%12d%16.2f%n", "Minimum:", minCat, minPressure, minWind);
        System.out.printf("%18s%7d%12d%16.2f%n", "Maximum:", maxCat, maxPressure, maxwind);

    }
}