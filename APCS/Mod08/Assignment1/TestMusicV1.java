/**
 * Purpose: Doing sequential searches.
 * @author Shawn Velsor
 * @version 3/28/2021
 */


public class TestMusicV1 {
   public static void main(String[] args) {
       Music[] list = {new Music("Rumbum Cucullo", 2020, "ymfah"), 
       new Music("Pigstep", 2020, "Qumu"),
       new Music("Dark World", 2018, "Mikel"),
       new Music("Here We Go", 2015, "Giants of Industry"),
       new Music("Midna's Lament", 2019, "Qumu"),
       new Music("Everything Black", 2017, "Unlike Pluto"),
       new Music("The Man Who Sold the World", 1985, "Midge Ure"),
       new Music("Old Friends", 2018, "Half an Orange"),
       new Music("Paint it, Black", 1966, "The Rolling Stones"),
       new Music("Captain", 2018, "Jessie James")};

       //methods that have and can find the songs with title, artist, and years corrctly
       searchSong(list, "The Man Who Sold the World");
       System.out.println();
       searchArtist(list, "Qumu");
       System.out.println();
       searchYear(list, 2018);

       //now to do the exact opposite.
       System.out.println();
       System.out.println("Giving Artist, title, and year that have nothing to them, should report no finds");
       System.out.println();
      

       searchSong(list, "Banana Boat");
       System.out.println();
       searchArtist(list, "Maverick Stone");
       System.out.println();
       searchYear(list, 2008);
   }

   //Make one method that can be modified to be used with other variables.
   //use a boolean to check to see if it has found songs or not. if one song has been found it should just
   //change the boolean to true.

   public static void searchSong(Music[] list, String name) {
      boolean songFound = false;

      System.out.println("Seaching for " + name);
      System.out.println();
      
      for(Music music : list){
         if(music.getTitle().equals(name)){
           System.out.printf("Song found. Title: %s, Artist: %s%n" , music.getTitle(), music.getArtist());
           songFound = true;
         }
      }
      if(!songFound){
         System.out.println("No songs contining to that name!");
      }
  }

   public static void searchArtist(Music[] list, String name) {
      boolean songFound = false;

       System.out.println("Seaching for " + name);
       System.out.println();
       
       for(Music music : list){
          if(music.getArtist().equals(name)){
            System.out.printf("Song found. Title: %s, Artist: %s%n" , music.getTitle(), music.getArtist());
            songFound = true;
          }
       }
       if(!songFound){
         System.out.println("No songs contining to that Artist!");
      }
   }

   public static void searchYear(Music[] list, int year) {
      boolean songFound = false;

      System.out.println("Seaching in year: " + year);
      System.out.println();
      
      for(Music music : list){
         if(music.getYear() == year){
           System.out.printf("Song found. Title: %s, Artist: %s%n", music.getTitle(), music.getArtist());
           songFound = true;
         }
      }
      if(!songFound){
         System.out.println("No songs contining to that year!");
      }
  }
}
