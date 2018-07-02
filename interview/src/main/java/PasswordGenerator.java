import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {



        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";
        String everything = alphabet+numbers+symbols;
        String[] allChars = everything.split("");


        for (int o = 0;o < 10;o++) {
            Random r = new Random();
            int Low = 0;
            int High = 45;
            int Result = r.nextInt(High-Low) + Low;
            password += allChars[Result];
        }




        return password;
    }
}
