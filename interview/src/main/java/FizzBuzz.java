public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {

        int i = 231;
        String m = "fizz";
        // String result = "" ;

        if ((i % 3) == 0) {
            System.out.println(m);
        }

        int k = 440;
        String n = "buzz";

        if ((k % 5) == 0) { // here I'm testing if the second number (int k) is divisible by 5
            System.out.println(n);
        }

        int j = 101640;

        if ((j % 15) == 0) { // here I'm testing if the third number (int j) is divisible by 3 and 5
            System.out.println(m + n);
        }

    }

    public String fizzBuzz ( int i ){
        String result = "";

        if (i % 3 == 0) result += "fizz";

        if (i % 5 == 0) result += "buzz";

        //TODO - implement method!
        return result;

    }
}

