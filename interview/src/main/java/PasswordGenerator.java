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
        String everything = alphabet+numbers+symbols;    //to easily convert it to an array :P
        String[] allChars = everything.split("");  // a string array that contains all characters :D


        for (int o = 0;o < 10;o++) {
            Random r = new Random();
            int Low = 0;
            int High = 45; // the number of elements in the array is 44 (P.S. 45 is excluded)
            int Result = r.nextInt(High-Low) + Low;
            password += allChars[Result];
        }

       // BTW the code doesn't pass the test because of the .isLetter and .isDigit , I thought this would be more secure


        return password;
    }
}
