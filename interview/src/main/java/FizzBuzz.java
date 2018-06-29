public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {

        String result = "";
        if (i % 3 == 0){
            result += "fizz";
        }
        if (i % 5 == 0) {
            result += "buzz";
        }


        return result;

    }
}