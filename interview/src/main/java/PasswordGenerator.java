import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());


    }

    public static String generatePassword() {
        Random rand = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz" ;
        String numb = "0123456789";
        String symb = "`˜!@#$%&ˆ*'?+=<>";
        String s = "";

        for (int i = 0; i < 5 ; i++) {
            int  n = rand.nextInt(26);
            s += chars.charAt(n);
        }
        for (int k = 0; k < 4; k++) {
            int m = rand.nextInt(10);
            s += numb.charAt(m);
        }

        int o = rand.nextInt(16) ;
        s += symb.charAt(o);


       //TODO - implement method!

        return s;

    }

}
