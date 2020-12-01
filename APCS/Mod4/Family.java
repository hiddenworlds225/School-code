/*
    4.03 Family composition

    Purpose: Learn how to access and read files.

    @Shawn Velsor
    Date:11/23/2020
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

class Family
{
    public static void main(String[] args) throws IOException
    {
        DecimalFormat df = new DecimalFormat("0.00");
        File txtFile = new File("APCS\\Mod4\\Files\\maleFemaleInFamily.txt");
        Scanner fileScan = new Scanner(txtFile);
        
        String token = "";

        int boys = 0;
        int girls = 0;
        int both = 0;

        int total = 0;

        while(fileScan.hasNext())
        {
            token = fileScan.next();
            if(token.equals("BB"))
            {
                boys++;
            }
            if(token.equals("GG"))
            {
                girls++;
            }
            if(token.equals("BG") || token.equals("GB"))
            {
                both++;
            }
        }
        fileScan.close();

        total = boys + girls + both;

        System.out.println("Family Ratio Statistics\n\nTotal Families: " + total +
        "\nNumber of families with\nTwo Boys: " + boys + ", Composition: " + 
        df.format(((double) boys / total) * 100) + "%;\nTwo Girls: " + girls + ", Composition: " +
         df.format(((double) girls / total) * 100) + 
        "%;\nOne Boy & Girl:" + both + ", Composition: " + 
        df.format(((double) both / total) * 100) + "%");

    }
}