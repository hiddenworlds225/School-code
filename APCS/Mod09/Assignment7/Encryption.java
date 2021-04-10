package Assignment7;

/**
 * Encryption; The heart of the program
 * 
 * @author Shawn Velsor
 * @version 4/10/2021
 */
public class Encryption {

    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static char[] shiftedAlphabet = new char[26];

    private Encryption() {
        // N/A
    }

    public static String encrypt(String msg) {
        char[] chrMsg = msg.toUpperCase().toCharArray();
        
        var encrypted = "";
        for(int i = 0; i < chrMsg.length; i++){
            for (int x = 0; x < alphabet.length; x++) {
                if(chrMsg[i] == alphabet[x]){
                    encrypted += shiftedAlphabet[x];
                }
            }
        }

        return encrypted;
    }

    public static char[] getEncryption() {
        return shiftedAlphabet;
    }


    public static void setShift(int key) {

        int shiftKey = key;

        // A place to hold the shifted chars
        char[] shift = new char[shiftKey];

        int i = 0;
        // iterate through the char arr to get the chars to shift
        for (char c : alphabet) {
            // if i is less than the shift[] length, we want to add the character to the
            // shift arr.
            if (i < shift.length) {
                shift[i] = c;
                i++;
            }
        }

        // then shift all chars over to the last index until
        // we reach the cutoff index
        for (int y = 0; y < alphabet.length; y++) {
            if (y > shiftKey - 1) {
                shiftedAlphabet[y - shiftKey] = alphabet[y];
            }
        }

        // negate the shiftKey to get the shift cutoff
        int shiftCutoff = shiftedAlphabet.length - shiftKey;

        // Now, to add the shifted variables
        // int a will help get the correct position in the shift arr
        int a = 0;

        for (int z = shiftCutoff; z < shiftedAlphabet.length; z++) {
            shiftedAlphabet[z] = shift[a];
            a++;
        }

       printInfo(shiftKey);
    }

    public static void printInfo(int shiftKey){
        System.out.println("Shift key: " + shiftKey);
        System.out.print("Normal alphabet: ");
        for (char c : alphabet) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Encrypted alphabet: ");
        for (char c : shiftedAlphabet) {
            System.out.print(c);
        }
        System.out.println();
    }
}