import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {


        Random rand = new Random();

        int n0 = rand.nextInt(9);
        int n1 = rand.nextInt(9);
        int n2 = rand.nextInt(9);
        int n3 = rand.nextInt(9);


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char c0 = alphabet.charAt(rand.nextInt(25));
        char c1 = alphabet.charAt(rand.nextInt(25));
        char c2 = alphabet.charAt(rand.nextInt(25));
        char c3 = alphabet.charAt(rand.nextInt(25));
        char c4 = alphabet.charAt(rand.nextInt(25));

        String characters = "!@#$%";
        char f0 = characters.charAt(rand.nextInt(4));


        // for testing!
        System.out.println("password: " + c0 + c1 + c2 + c3 + c4 + n0 + n1 + n2 + n3 + f0);


    }

    public static String generatePassword() {
        Random rand = new Random();

        String number = "123456789";
        char n0 = number.charAt(rand.nextInt(8));
        char n1 = number.charAt(rand.nextInt(8));
        char n2 = number.charAt(rand.nextInt(8));
        char n3 = number.charAt(rand.nextInt(8));


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char c0 = alphabet.charAt(rand.nextInt(25));
        char c1 = alphabet.charAt(rand.nextInt(25));
        char c2 = alphabet.charAt(rand.nextInt(25));
        char c3 = alphabet.charAt(rand.nextInt(25));
        char c4 = alphabet.charAt(rand.nextInt(25));

        String characters = "!@#$%";
        char f0 = characters.charAt(rand.nextInt(4));



        return  "" + c0 + c1 + c2 + c3 + c4 + n0 + n1 + n2 + n3 + f0;
        // for testing!



        //TODO - implement method!


    }
}
