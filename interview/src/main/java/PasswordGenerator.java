import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {}

    public static String generatePassword() {
        //The letters and symbols that will be later used for generating a password
        //To increase the complexity of the password, it will be composed as first half letter, the rest except the last as number and the last as a symbol
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~`!@#$%^&*()_-+={[}]|\\:;\"\'<,>.?/";
        String password = "";

        Random rand = new Random();

        //Define a variable that would show us which digit we are now adding
        int charAddPosition = 1;

        //Generate letters for the first half
        while (charAddPosition <= 5){
            int randomCharPosition = rand.nextInt(52);
            password += characters.charAt (randomCharPosition);
            charAddPosition ++;
        }

        //Generate numbers for the other half except the last digit
        while (charAddPosition < 10){
            int randomNumPosition = rand.nextInt(10) + 52;
            password += characters.charAt (randomNumPosition);
            charAddPosition ++;
        }

        //Generate symbol for the last digit
            int randomSymbolPosition = rand.nextInt(33)+62;
            password += characters.charAt (randomSymbolPosition);

       //Print and test
       System.out.println(password);
        return password;
    }
}

// 06.29.18 Coding Fin ><(((º>