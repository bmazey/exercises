import java.util.Arrays;

public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {
        int i=0;
        while (i<100){
            i=i+1;
            int[] intArray = new int[]{ i };
            System.out.println(Arrays.toString(intArray));

        }
    }


    public String fizzBuzz(int i) {
        String result="";
        if  (i%3==0)
    if (i%5==0)
        result+="fizzbuzz";
else
    System.out.println("fizz");
        //TODO - implement method;
            else if (i%5==0)
          result+="buzz";
        return result;

    }
}
