public class FizzBuzz {


    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {


    }

    public String fizzBuzz(int s) {
        if (s % 3 == 0 && s % 5 == 0) {
            return ("fizzbuzz");
        }

        if (s % 3 == 0) {
            return ("fizz");

        }
        if (s % 5 == 0) {
            return ("buzz");
        }


        //TODO - implement method!
        return new String();

    }
}
