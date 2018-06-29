public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {
        String result = "";

        if (i%3 == 0 && i%5==0){
            result = "fizzbuzz";}

        else if (i % 3 == 0)
            result = "fizz";

        else
            result = "buzz";

        return result;
    }
}
