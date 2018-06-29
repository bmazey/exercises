import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
        String password = "";
        String passwordLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String passwordNumbers = "0123456789";
        String passwordSymbols = "~!@#$%^&*()_+-=`";
    Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(passwordLetters.length());
            password += (passwordLetters.charAt(randomIndex));
        }


        for (int i = 0; i < 4; i++){
            int randomIndex2 = rand.nextInt(passwordNumbers.length());
            password += (passwordNumbers.charAt(randomIndex2));
        }

    int randomIndex3 = rand.nextInt(passwordSymbols.length());
        password += (passwordSymbols.charAt(randomIndex3));
        return  password;

    }
}
