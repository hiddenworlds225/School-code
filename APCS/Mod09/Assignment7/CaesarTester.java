package Assignment7;

import java.util.Scanner;

/**
 * Test the Encryption and Decryption classes
 * 
 * @author Shawn Velsor
 * @version 4/10/2021
 */

public class CaesarTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the encryption center!");

        System.out.println("First, we need to set the shift key, please provide a number between 0-25: ");
        int key = input.nextInt();

        while (key < 0 || key > 25) {
            System.out.println("Key can only be a number between 0-25: ");
            key = input.nextInt();
        }

        Encryption.setShift(key);

        // allowsus to quit
        boolean loop = true;

        while (loop) {

            System.out.println(
                    "Select (1) for encryption, (2) for decryption, (3) to set a new shift key and (4) to quit: ");
            int mode = input.nextInt();

            // nemoving \n item
            input.nextLine();

            switch (mode) {
            case 1:

                while (true) {
                    System.out.println("Please type your message. Enter Q to quit. Characters will be capitalized, "
                            + "spaces and special characters will be stripped from the message: ");
                    String msg = input.nextLine();

                    if (msg.equalsIgnoreCase("Q")) {
                        break;
                    }

                    System.out.println(Encryption.encrypt(msg));
                }

                break;

            case 2:

                while (true) {
                    System.out.println("Please type your encrypted message. Enter Q to quit.: ");
                    String msg = input.nextLine();

                    if (msg.equalsIgnoreCase("Q")) {
                        break;
                    }

                    System.out.println(Decryption.decrypt(msg));
                }

                break;

            case 3:
                System.out.println("Please provide a new shift key: ");
                key = input.nextInt();

                Encryption.setShift(key);
                break;

            case 4:
                loop = false;
                break;

            default:
                System.out.println("This was not a correct mode to choose, please input mode 1, 2, 3 or 4!");
                break;
            }
        }

        input.close();
    }
}
