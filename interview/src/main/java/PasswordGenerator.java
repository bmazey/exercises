import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random R = new Random();
        String symbol = "!@#$%^&*";

        for (int i = 0; i < 5; i++) {
            password += alphabet.charAt(R.nextInt(25));

        }

        for (int i = 0; i < 4; i++) {
            password += (R.nextInt(9));
        }

        password += symbol.charAt(R.nextInt(8));

       //TODO - implement method!

        return password;
    }
}
