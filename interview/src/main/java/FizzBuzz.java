public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

        String isFizzBuzz = "";

        int i = 15;

        if(i % 3 == 0){
            System.out.println("fizz");
        }
        if(i % 5 == 0){
            System.out.print("buzz");
        }

    }

    public String fizzBuzz(int i) {

        String isFizzBuzz = "";

        if(i % 3 == 0){
            isFizzBuzz += "fizz";
        }
        if(i % 5 == 0){
            isFizzBuzz += "buzz";
        }

        //TODO - implement method!
        return isFizzBuzz;

    }
}
