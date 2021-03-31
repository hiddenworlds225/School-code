package Assignment2;
//Remove this from both scripts if necessary, this is needed for my IDE.

/**
 * Purpose: Doing binary searches.
 * 
 * @author Shawn Velsor
 * @version 3/28/2021
 */

public class TestMusicV2 {
   public static void main(String[] args) {
      Music[] list = { new Music("Rumbum Cucullo", 2020, "ymfah"), new Music("Pigstep", 2020, "Qumu"),
            new Music("Dark World", 2018, "Mikel"), new Music("Here We Go", 2015, "Giants of Industry"),
            new Music("Midna's Lament", 2019, "Qumu"), new Music("Everything Black", 2017, "Unlike Pluto"),
            new Music("The Man Who Sold the World", 1985, "Midge Ure"),
            new Music("Old Friends", 2018, "Half an Orange"), new Music("Paint it, Black", 1966, "The Rolling Stones"),
            new Music("Captain", 2018, "Jessie James") };

      // methods that have and can find the songs with title, artist, and years
      // correctly
      searchSong(list, "Captain");
      System.out.println();
      searchArtist(list, "Qumu");
      System.out.println();
      searchYear(list, 2018);

      // // now to do the exact opposite.
      System.out.println();
      System.out.println("Giving Artist, title, and year that have nothing to them, should report no finds");
      System.out.println();

      searchSong(list, "Banana Boat");
      System.out.println();
      searchArtist(list, "Maverick Stone");
      System.out.println();
      searchYear(list, 2008);
   }

   // Selection sort for this version of TestMusicV2

   // Sort Titles
   static void sortTitle(Music[] list) {

      int n = list.length;

      for (int i = 0; i < n - 1; i++) {
         int min_idx = i;
         for (int j = i + 1; j < n; j++)
            if (list[j].getTitle().compareTo(list[min_idx].getTitle()) < 0)
               min_idx = j;

         // Swap the found minimum element with the first
         // element
         Music temp = list[min_idx];
         list[min_idx] = list[i];
         list[i] = temp;
      }
   }

   // Sort Author
   static void sortArtist(Music[] list) {

      int n = list.length;

      for (int i = 0; i < n - 1; i++) {
         int min_idx = i;
         for (int j = i + 1; j < n; j++)
            if (list[j].getArtist().compareTo(list[min_idx].getArtist()) < 0)
               min_idx = j;

         // Swap the found minimum element with the first
         // element
         Music temp = list[min_idx];
         list[min_idx] = list[i];
         list[i] = temp;
      }
   }

   // sort year
   static void sortYear(Music[] list) {

      int n = list.length;

      for (int i = 0; i < n - 1; i++) {
         int min_idx = i;
         for (int j = i + 1; j < n; j++)
            if (list[j].getYear() < list[min_idx].getYear())
               min_idx = j;

         // Swap the found minimum element with the first
         // element
         Music temp = list[min_idx];
         list[min_idx] = list[i];
         list[i] = temp;
      }
   }

   // Make one method that can be modified to be used with other variables.
   // use a boolean to check to see if it has found songs or not. if one song has
   // been found it should just
   // scan the area around the index

   public static void searchSong(Music[] list, String name) {

      System.out.println("Searching by Title: " + name);

      // Sort is for this specific request method. Required no matter what.
      sortTitle(list);

      int l = 0, r = list.length - 1;
      int res = -1;
      while (l <= r) {
         int m = l + (r - l) / 2;

         res = name.compareTo(list[m].getTitle());

         // Check if x is present at mid
         if (res == 0) {
            System.out.printf("Song: %s, Artist: %s%n", list[res].getTitle(), list[res].getArtist());
            break;
         }

         // If x greater, ignore left half
         if (res > 0) {
            l = m + 1;
         }

         // If x is smaller, ignore right half
         else {
            r = m - 1;
         }

      }
      if (res != 0) {
         System.out.println("No songs containing to that Title!");
      }

   }

   public static void searchArtist(Music[] list, String name) {

      System.out.println("Searching by Artist: " + name);

      // sorting made specifically for this method
      sortArtist(list);

      int l = 0, r = list.length - 1;
      int res = -1;

      // looking for multiple titles underneath the Artist's name.
      // We will need a found target int and acan around it
      int scanTarget = -1;

      while (l <= r) {
         int m = l + (r - l) / 2;

         res = name.compareTo(list[m].getArtist());

         // Check if x is present at mid
         if (res == 0) {
            scanTarget = m;
            break;
         }

         // If x greater, ignore left half
         if (res > 0) {
            l = m + 1;
         }

         // If x is smaller, ignore right half
         else {
            r = m - 1;
         }

      }
      if (res != 0) {
         System.out.println("No songs containing to that Artist!");
      }

      if (res == 0) {
         // look left first, then right

         // DON'T FORGET TO ADD CHECKS TO PREVENT IndexOutOfBounds ERROR

         int i = scanTarget;
         while (true) {
            if (list[i].getArtist().equals(name) && i > 0) {
               System.out.printf("Song: %s, Artist: %s%n", list[i].getTitle(), list[i].getArtist());
               i--;
            } else {
               break;
            }
         }

         // add + 1 to allow it to not look at the same thing again.
         i = scanTarget + 1;
         while (true) {
            if (list[i].getArtist().equals(name) && i < list.length) {
               System.out.printf("Song: %s, Artist: %s%n", list[i].getTitle(), list[i].getArtist());
               i++;
            } else {
               break;
            }
         }
      }

   }

   public static void searchYear(Music[] list, int year) {

      System.out.println("Searching by Year: " + year);

      sortYear(list);

      int high = list.length;
      int low = -1;
      int probe;

      while (high - low > 1) {
         probe = (high + low) / 2;
         if (list[probe].getYear() > year)
            high = probe;
         else
            low = probe;
      }

      // look left first, then right

      // DON'T FORGET TO ADD CHECKS TO PREVENT IndexOutOfBounds ERROR

      int i = low;

      while (true) {
         if (list[i].getYear() == year && i > 0) {
            System.out.printf("Song: %s, Artist: %s%n", list[i].getTitle(), list[i].getArtist());
            i--;
         } else {
            break;
         }
      }

      // add + 1 to allow it to not look at the same thing again.
      i = low + 1;
      while (true) {
         if (list[i].getYear() == year && i < list.length) {
            System.out.printf("Song: %s, Artist: %s", list[i].getTitle(), list[i].getArtist());
            i++;
         } else {
            break;
         }
      }
   }
}
