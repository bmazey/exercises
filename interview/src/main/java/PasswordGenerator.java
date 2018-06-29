import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
        String password = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String chars = "@#$!";
        Random rand = new Random();
        for (int i = 0 ; i < 5; i++) {
            int randint = rand.nextInt(25);
            password += alpha.charAt(randint);
        }
        for (int i = 0; i < 4; i++){
            int randint = rand.nextInt(9);
            password += nums.charAt(randint);
        }
        for (int i = 0; i < 1; i++) {
            int randint = rand.nextInt(3);
            password += chars.charAt(3);
        }
        return password;
    }
}
