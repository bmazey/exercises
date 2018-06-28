import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String result = "";
        Random rand = new Random();


        String alphabet = "abcdefghijklmnopkrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        for (int i = 0; i < 5; i++) {
            result += alphabet.charAt(rand.nextInt(alphabet.length() - 1));
        }

        for (int i = 0; i < 4; i++) {
            result += numbers.charAt(rand.nextInt(numbers.length() - 1));
        }

        result += symbols.charAt(rand.nextInt(symbols.length() - 1));

        return result;
    }
}

