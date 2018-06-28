public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     *
     * @param args
     */

    public static void main(String[] args) {


    }

    public String fizzBuzz(int i) {

        String ellie = "";
        if(i % 3== 0) {
            ellie += "fizz";
        }


        if(i % 5== 0) {
            ellie += "buzz";
        }



        return ellie;

    }

}