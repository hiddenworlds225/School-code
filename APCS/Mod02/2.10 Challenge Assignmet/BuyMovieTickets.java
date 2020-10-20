import java.util.Scanner;
/**
 * Getting input from the user.
 *
 * @author Shawn Velsor 
 * @version 10/8/2020
 */
public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Good Evening");
        
        System.out.print("Please state your name: ");
        String name = in.nextLine();
        
        System.out.print("Please state today's date (mm/dd/yyyy): ");
        String date = in.nextLine();
        
        System.out.print("What movie do you want to see? ");
        String movieName = in.nextLine();
        
        System.out.print("How many tickets? ");
        int numTickets = Integer.parseInt(in.nextLine());
        
        System.out.print("What is the ticketPrice? $");
        double ticketPrice = Double.parseDouble(in.nextLine());
        
        System.out.print("What is the card number? (#####-###-####)");
        String cardNum = in.nextLine();
        
        System.out.print("Enter your pin (####): ");
        int cardPin = Integer.parseInt(in.nextLine());
        
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        
        String[] firstLast = name.split(" ");
        String[] cardNumSplit =cardNum.split("-");
        double total = ticketPrice * numTickets;
        
        System.out.println("Your e-Reciept");
        System.out.println();
        System.out.println();
        System.out.println(date);
        System.out.println("Order number: " + firstLast[1].substring(0, 2) + cardNumSplit[1]);
        System.out.println();
        System.out.println(firstLast[0].substring(0, 1) + ". " + firstLast[1]);
        System.out.println("#####-###-" + cardNumSplit[2]);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of tickets: " + numTickets);
        System.out.println("Price: " + ticketPrice);
        System.out.println();
        System.out.println();
        System.out.println("Total: $" + total);
        System.out.println("Cash Back: $0.00");
        System.out.println();
        System.out.println("Thank you and enjoy your movie!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        
        
    }
}
