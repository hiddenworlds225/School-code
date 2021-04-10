package Assignment7;

public class Decryption {

    /**
     * Decryption class for CaesarTester.java. Relies on Encryption.java
     */

    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    //Since we already generated the shift in the Encryption class, we can request it here.
    private static char[] shiftedAlphabet = Encryption.getEncryption();

    //Just reverse the decryption process
    public static String decrypt(String msg) {
        char[] chrMsg = msg.toUpperCase().toCharArray();
        
        var decrypted = "";
        for(int i = 0; i < chrMsg.length; i++){
            for (int x = 0; x < alphabet.length; x++) {
                if(chrMsg[i] == shiftedAlphabet[x]){
                    decrypted += alphabet[x];
                }
            }
        }

        return decrypted;
    }

    private Decryption(){
        // N/A
    }
}
