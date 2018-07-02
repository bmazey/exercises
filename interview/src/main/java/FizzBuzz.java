public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {

        String result = "";


        if (i%3==0)
            if (i%5==0)
                result += "fizzbuzz";
            else
                result += "fizz";



        else if (i%5==0)
            result += "buzz";


        else
            result += i;


        return result;

    }
}
