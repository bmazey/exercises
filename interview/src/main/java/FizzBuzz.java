import java.util.Arrays;

public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

            System.out.println(fizzBuzz(45));


        }



    public static String fizzBuzz(int i) {
        String result="";
        if  (i%3==0)
    if (i%5==0)
        result+="fizzbuzz";
else
    result+="fizz";
        //TODO - implement method;
            else if (i%5==0)
          result+="buzz";
        return result;

    }
}
