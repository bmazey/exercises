import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {
String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
String password = "";
Random randvalue = new Random();
       int loop;
       //adding letters
       for(loop = 1; loop <= 4; loop++)
           password += (characters.charAt(randvalue.nextInt(52)));
       //adding numbers
       for(loop = 1; loop <= 4; loop++)
           password += (characters.charAt(randvalue.nextInt(10) + 52));
       //adding rand letters-numbers
       for(loop = 1; loop <= 2; loop++)
           password += (characters.charAt(randvalue.nextInt(62)));
       //debug
       System.out.println(password);
        return password;
    }
}
