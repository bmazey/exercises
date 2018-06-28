public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {

        if (i % 15 == 0) {
            System.out.println("Fizzbuzz!");
        }
        else if (i % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (i % 5 == 0) {
            System.out.println("Buzz");
        }
        return new String();

    }
}
