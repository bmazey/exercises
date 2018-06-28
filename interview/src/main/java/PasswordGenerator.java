import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
        String passwordGenerator = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String symbol = "!@#$%^&*()_-";
        Random randInt = new Random();

        for(int i = 0; i < 5; i++) {
            passwordGenerator += alphabet.charAt(randInt.nextInt(25));
        }

        for(int k = 0; k < 4; k++) {
            passwordGenerator += randInt.nextInt(9);
        }

        passwordGenerator += symbol.charAt(randInt.nextInt(11));

        return passwordGenerator;

        }

}
