import java.sql.Array;

public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

        //mycomment
    }

    public String fizzBuzz(int i) {

        if (i % 15 == 0) { //we have to check for the 15 first so that if it was a fizzbuzz it doesn't appear as a fizz!
            return ("Fizzbuzz!");
        }
        else if (i % 3 == 0) { // The "%" sign is called the "Modulo" sign, which checks the remainder after division :D
            return ("Fizz");
        }
        else if (i % 5 == 0) {
            return ("Buzz");
        }
        return "";
    }
}
