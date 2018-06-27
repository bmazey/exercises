public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {

        String result = "";

        /** Result is the string that gets put into the test.
         */

        if (i%3==0)
            if (i%5==0)
                result += "fizzbuzz";
            else
                result += "fizz";

        /** This part tests if "i" is divisible by 3. Divisibility is tested by seeing if the remainder = 0. If it is,
         * it then tests for divisibility by 5. If it is also divisible by 5, "fizzbuzz" is added onto "result", and if it is only divisible
         * by 3, "fizz" is added to "result".
         */

        else if (i%5==0)
            result += "buzz";

        /** If "i" is not divisible by 3, the program then tests for divisibility by 5. If it is divisible, then "buzz" is added onto "result".
         */

        else
            result += i;

        /** Finally, if "i" is divisible by neither 5 nor 3, the program simply prints the value of "i".
         */



        return result;

    }
}
