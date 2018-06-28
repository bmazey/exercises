import java.util.Arrays;

public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

            System.out.println(fizzBuzz(45));
            //type every integer-typed number in i column


        }



    public static String fizzBuzz(int i) {
        String result="";
        if  (i%3==0)
    if (i%5==0)
        result+="fizzbuzz";
    /**
     * If i modulus 3 with result=0 and modulus 5 with result=0 then result will be equal to fizzbuzz
     */
    else
        result+="fizz";
        /**
         * If first conditional was false,result will be fizz
         */
        //TODO - implement method;
            else if (i%5==0)
          result+="buzz";
            //result will be equal to buzz, if i modulus 5 without remainder
        return result;
//returning result
    }
}
