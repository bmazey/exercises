import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random Num = new Random();
        String symbol = "!@#$%^&*";

        for (int i = 0; i < 5; i++) {
            password += alphabet.charAt(Num.nextInt(25));
        }

        for (int i = 0; i < 4; i++) {
            password += (Num.nextInt(9));
        }

        password += symbol.charAt(Num.nextInt(8));
       //TODO - implement method!

        return password;
    }
}
