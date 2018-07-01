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
        String[] allChars;
        for (int a = 0;a < alphabet.length();a++) {
            allChars[a] = String.valueOf();
        }
        for (int n = alphabet.length();n < (alphabet.length() + numbers.length());n++) {
            int nn = 0;
            allChars[n] = numbers.charAt(nn);
            nn++;
        }
        for (int s = (alphabet.length()+numbers.length());s < (alphabet.length()+numbers.length()+symbols.length());s++)  {
            int ss = 0;
            allChars[s] = symbols.charAt(ss);
            ss++;
        }

        int Low = 0;
        int High = 100;
        int Result = r.nextInt(High-Low) + Low;


        System.out.println(allChars.length);
        }
}
