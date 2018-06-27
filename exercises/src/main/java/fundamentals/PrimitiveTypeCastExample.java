package fundamentals;

public class PrimitiveTypeCastExample {

    public static void main(String[] args) {

        int i = 10;
        double k = 2.5;
        double j = 3.5;
        int w = 2 * i;
        boolean guess = false;
        char c = '1';

        // && "and"
        // || "or"

        if ((i > k) && (w > j)) {
            System.out.println("true!");
            System.out.println("second statement!");
        }

        if (!guess) {
            System.out.println("guess equals " + guess);
            System.out.println("who woudl've guessed?!");
        }


        else if (i < k) System.out.println("else if says true!");

        else System.out.println("false!");

        String fox = "the quick brown fox jumps over the lazy dog.";

    }

}
