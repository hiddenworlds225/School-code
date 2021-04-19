/**
 * This is a class that tests the Card class.
 *
 *  Shawn Velsor
 *  4/19/2021
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      Card fiveDiamonds = new Card("five", "diamonds", 5);

      System.out.println("**** Tests Card 2: five of diamonds ****");
      System.out.println("  rank: " + fiveDiamonds.rank());
      System.out.println("  suit: " + fiveDiamonds.suit());
      System.out.println("  pointValue: " + fiveDiamonds.pointValue());
      System.out.println("  toString: " + fiveDiamonds.toString());
      System.out.println();

      // Test card 3
      Card kingSpades = new Card("king", "spades", 13);

      System.out.println("**** Tests Card 3: king of spades ****");
      System.out.println("  rank: " + kingSpades.rank());
      System.out.println("  suit: " + kingSpades.suit());
      System.out.println("  pointValue: " + kingSpades.pointValue());
      System.out.println("  toString: " + kingSpades.toString());
      System.out.println();

      // Test matches() method
      System.out.println("Matching five of diamonds with king of spades: " + fiveDiamonds.matches(kingSpades));
      System.out.println("Matching ace of hearts with king of spades: " + aceHearts.matches(kingSpades));
      System.out.println("Matching king of spades with king of spades: " + kingSpades.matches(new Card("king", "spades", 13)));

   }
}
