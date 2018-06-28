import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
        String passwordGenerator = "";

        for(int i = 0; i <= 5; i++) {
            passwordGenerator += char.random;
        }

        for(int k = 5; k > 5 && k <= 9; k++) {
            passwordGenerator += int.random;
        }

            passwordGenerator.charAt(10) += int.random || char.random;
        }
        return passwordGenerator;
}
