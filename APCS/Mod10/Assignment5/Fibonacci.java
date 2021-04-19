import java.util.Scanner;

/**
 * Description: the Fibonacci number generator.
 * @author Shawn Velsor
 * @version 4/19/2021
 */

class Fibonacci {
    public static void main(String[] args) {
        // need scanner
        Scanner in = new Scanner(System.in);
        // display text
        System.out.println("Welcome to the Fibonacci system");

        while (true) {
            // add quit modifier
            String quit = in.nextLine();
            if (quit.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Please input a number: ");
            // get int input
            int num = in.nextInt();
            // remove end-of-line.
            in.nextLine();

            // display results
            System.out.println(fibonacci(num));
        }

        in.close();

    }

    public static int fibonacci(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

}