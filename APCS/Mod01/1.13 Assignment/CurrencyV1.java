/*
 * PROJECT TITLE: 1.13 Extra Challenge Assignment
 *PURPOSE OF PROJECT: Converting money with logic
 *VERSION or DATE: 9/23/2020 
 *AUTHOR: Shawn Velsor
 *
 *Used Bank Of America Currency || https://www.bankofamerica.com/foreign-exchange/currency-converter.go#131MXN
 *
 ************************** PMR***********************************
 *<+s>: It's nice to know how to properly use math in multiple ways alongside variables 
 *<-s>: didn't assign exchange rate variables correctly, but fixed it when I found out.
 *************************************************************************** 
 *In the future: 
 * find a way to crunch it down more.
 */
public class CurrencyV1
{
    public static void main(String[] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double yenSpent = 20165.49;
        double euroSpent = 610.47;
        double pesosExchangeRate = 0.0471;         //Replaced original rate to match current rate
        double euroExchangeRate = 1.2307;
        double yenExchangeRate = 0.00996;
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsSpentInEurope = 0.0;
        double dollarsSpentInJapan = 0.0;
        double remainingDollars= 0.0;        // US dollars remaining after Mexico

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Starting money: " + startingUsDollars);
        System.out.println();
        System.out.println();
        System.out.println("Pesos spent: " + pesosSpent);
        dollarsSpentInMexico = pesosSpent * pesosExchangeRate;
        System.out.println("US equivalent: "+ dollarsSpentInMexico);
        remainingDollars = startingUsDollars - dollarsSpentInMexico; 
        System.out.println("Remaining US money: " + remainingDollars);
        System.out.println();
        System.out.println();
        
        //simplifying some math
        
        System.out.println("Euros spent: " + euroSpent);
        dollarsSpentInEurope = euroSpent * euroExchangeRate;
        System.out.println("US equivalent: "+ dollarsSpentInEurope);
        remainingDollars -= dollarsSpentInEurope; //here
        System.out.println("Remaining US money: " + remainingDollars);
        System.out.println();
        System.out.println();
        

        System.out.println("Yen spent: " + yenSpent);
        dollarsSpentInJapan = yenSpent * yenExchangeRate;
        System.out.println("US equivalent: "+ dollarsSpentInJapan);
        remainingDollars -= dollarsSpentInJapan; //and here
        System.out.println("Remaining US money: " + remainingDollars);
        System.out.println();
        System.out.println();


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;        //cost per item of first souvenir
        int budget1 = 100;         //budget for first item
        int totalItems1 = 0;       //how many items can be purchased
        int fundsRemaining1 = 0;   //how much of the budget is left
        
        totalItems1 = budget1 / costItem1;

        fundsRemaining1 = budget1 - (totalItems1 * costItem1);
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99; //cost per item of second souvenir
        int budget2 = 500;        //budget for second item
        int totalItems2 = 0;    //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left

        totalItems2 = (int) (budget2  / costItem2); //force the outcome into an int, otherwise, it will not work
        fundsRemaining2 = budget2 - (totalItems2 * costItem2);

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

