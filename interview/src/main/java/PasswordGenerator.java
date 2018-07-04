import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        Random r = new Random();

        String password = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";


        for (int i = 0; i < 5; i++) {
            password += alphabet.charAt(r.nextInt(alphabet.length()-1));
        }

        for (int i = 0; i < 4; i++) {
            password += numbers.charAt(r.nextInt(numbers.length() - 1));
        }

        password += symbols.charAt(r.nextInt(symbols.length() - 1));

        //test
        return password;
        }
}
