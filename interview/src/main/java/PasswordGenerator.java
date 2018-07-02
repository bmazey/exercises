import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        //TODO - implement method

        String password = "";

        Random rand = new Random();
        String letter= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        String symb = "!?@#$%";


        for (int i =0; i <5; i++) {
            int x = rand.nextInt(letter.length() - 1);

            password += letter.charAt(x);

        }

        for (int r = 0; r < 4; r++) {
            int y = rand.nextInt(9);
            password += num.charAt(y);
        }

        int z = rand.nextInt(5);
        password += symb.charAt(z);


        return password;
    }
}


