public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {
        String result = "";
        if (i % 15 == 0) { //we have to check for the 15 first so that if it was a fizzbuzz it doesn't appear as a fizz!
            result = "Fizzbuzz!";
        }
        else if (i % 3 == 0) { // The "%" sign is called the "Modulo" sign, which checks the remainder after division :D
            result = "Fizz";
        }
        else if (i % 5 == 0) {
            result = "Buzz";
        }
        return result;

    }
}
