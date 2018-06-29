import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String result = "";
        Random rand = new Random();


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        for (int i = 0; i < 5; i++) {
            result += alphabet.charAt(rand.nextInt(alphabet.length() - 1));
        }

        for (int k = 0; k < 4; k++) {
            result += numbers.charAt(rand.nextInt(numbers.length() - 1));
        }

        result += symbols.charAt(rand.nextInt(symbols.length()-1));

        //TODO - implement method!

        return result;

    }


}
