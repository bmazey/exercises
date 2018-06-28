public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {

        FizzBuzz myFizzBuzz= new FizzBuzz();

        int j = 231;
        if (j % 3 == 0)
            System.out.println("fizz");
        int k = 440;
        if (k % 5 == 0)
            System.out.println("buzz");
        int i = 101640;
        if (i % 15 == 0)
            System.out.println("fizzbuzz");

    }


    //cleaned up development


    public String fizzBuzz(int i) {
        //TODO - implement method!


        if (i%15 == 0)
            return ("fizzbuzz");
        else if (i%3 == 0)
           return ("fizz");
        else
            return ("buzz");


    }
}

