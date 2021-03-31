/**
 * @author Shawn Velsor
 * @version 3/31/2021
 */
public class MovieTesterV2 {

    public static void main(String[] args) {
        Movie[] movies = { new Movie("Hotel Transylvania", 2012, "Sony Pictures Animation"),
                new Movie("Open Season", 2006, "Sony Pictures Animation"),
                new Movie("Zootopia", 2016, "Walt Disney Animation Studios"),
                new Movie("Scooby-Doo and the Alien Invaders", 2000, "Hanna-Barbera Cartoons"),
                new Movie("Scooby-Doo! and the Legend of the Vampire", 2003, "Warner Bros. Animation"),
                new Movie("Monty Python and the Holy Grail", 1975, "Monty Python"),
                new Movie("Guardians of the Galaxy", 2014, "Marvel Studios"),
                new Movie("Gnomeo & Juliet", 2011, "Touchstone pictures"),
                new Movie("Kung Fu Panda", 2008, "Dreamworks"), new Movie("WALL-E", 2008, "Dreamworks") };
        // print list
        printMovies(movies);

        System.out.println("Sorting by title.");
        sortTitle(movies);

        printMovies(movies);

        System.out.println("Sorting by year.");
        sortYear(movies);

        printMovies(movies);

        System.out.println("Sorting by company.");
        sortStudio(movies);

        printMovies(movies);

    }

    // Quick method to call for displaying titles
    public static void printMovies(Movie[] movies) {
        System.out.println();

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        System.out.println();
    }

    // Use same method; create one, adjust to meet needs for other methods.
    public static void sortTitle(Movie[] movies) {

        int n = movies.length;
        for (int i = 1; i < n; ++i) {
            Movie key = movies[i];
            int j = i - 1;

            while (j >= 0 && movies[j].getTitle().compareTo(key.getTitle()) > 0) {
                movies[j + 1] = movies[j];
                j = j - 1;
            }
            movies[j + 1] = key;
        }
    }

    public static void sortYear(Movie[] movies) {

        int n = movies.length;
        for (int i = 1; i < n; ++i) {
            Movie key = movies[i];
            int j = i - 1;

            while (j >= 0 && movies[j].getYear() > key.getYear()) {
                movies[j + 1] = movies[j];
                j = j - 1;
            }
            movies[j + 1] = key;
        }
    }

    public static void sortStudio(Movie[] movies) {

        int n = movies.length;
        for (int i = 1; i < n; ++i) {
            Movie key = movies[i];
            int j = i - 1;

            while (j >= 0 && movies[j].getStudio().compareTo(key.getStudio()) > 0) {
                movies[j + 1] = movies[j];
                j = j - 1;
            }
            movies[j + 1] = key;
        }
        
    }
}