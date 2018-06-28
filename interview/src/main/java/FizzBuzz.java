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
        myFizzBuzz.fizzBuzz(i);                   // Plugs in value into function
        myFizzBuzz.fizzBuzz(j);
        myFizzBuzz.fizzBuzz(k);
    }
    public String fizzBuzz(int i) {            // implementing the method

        String vani = "";
        if (i % 3==0){
            vani += "fizz";
        }
        if (i % 5==0){
            vani += "buzz";
        }
        return vani;                       // since nothing is divisible by 3 or 5 prints nothing

    }

    //comment!

}
