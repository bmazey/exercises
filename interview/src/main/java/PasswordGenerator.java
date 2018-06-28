import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String Password = "";
        String Alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random R = new Random();
        String symbol = "!@#$%^&*";

        for (int i = 0; i < 5; i++) {
            Password += Alphabet.charAt(R.nextInt(25));

        }

        for (int i = 0; i < 4; i++) {
            Password += (R.nextInt(9));
        }

        Password += symbol.charAt(R.nextInt(8));
       //TODO - implement method!

        return Password;
    }
}
