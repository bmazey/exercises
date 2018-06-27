public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {
        FizzBuzz myFizzBuzz= new FizzBuzz();        //
        int i =231;                                 // define variable
        int j =440;
        int k=101640;
        myFizzBuzz.fizzBuzz(i);                     // Plugs in value into function
        myFizzBuzz.fizzBuzz(j);
        myFizzBuzz.fizzBuzz(k);
    }
    public String fizzBuzz(int i) {            // implementing the method
        if (i%15 == 0)                              // checks if # is divisible by 3&5
            System.out.println("FizzBuzz");         // if true prints "FizzBuzz" if not moves on
        else if (i%3 == 0)                          // checks if # is divisible by 3
            System.out.println("Fizz");             // if true prints "Fizz" if not moves on
        else if (i%5 == 0)                          // checks if # is divisible by 5
            System.out.println("Buzz");             // if true prints "Buzz" if not moves on
        //TODO - implement method!
        return new String();                       // since nothing is divisible by 3 or 5 prints nothing

    }

    //comment!

}
