import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }


    public static String generatePassword() {
String password="";
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
char a=(char)(r.nextInt(26)+'a');
        char b = (char)(r.nextInt(26) + 'a');
        char z = (char)(r.nextInt(26) + 'a');
        char t = (char)(r.nextInt(26) + 'a');
        char  n = (char)(r.nextInt(9) + '0');
        char  y = (char)(r.nextInt(9) + '0');
        char  o = (char)(r.nextInt(9) + '0');
        char  p = (char)(r.nextInt(9) + '0');



        for(int i=0;i<10;i++){

        }


        return new String();
    }
}
