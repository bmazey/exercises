public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {



        if (i%3==0)
            if (i%5==0)
                System.out.print("fizzbuzz");
            else
                System.out.print("fizz");

        /** This part first tests if "i" is divisible by 3. Divisibility is tested by seeing if the remainder is 0. If it is,
         * it then tests for divisibility by 5. If it is also divisible by 5, "fizzbuzz" is printed, and if it is only divisible
         * by 3, "fizz" is printed.
         */

        else if (i%5==0)
            System.out.print("buzz");

        /** If "i" is not divisible by 3, the program then tests for divisibility by 5. If it is divisible, then "buzz" printed.
         */

        else
            System.out.print(i);

        /** Finally, if "i" is divisible by neither 5 nor 3, the program simply prints the value of "i".
         */


        return new String();

    }
}
