public class FizzBuzz {

    public static void main (String[] args) {
        for (int i = 0; i < 100; i++) {

            System.out.print(i + ":");

            if (i % 3 == 0) System.out.print("fizz");
            if (i % 5 == 0) System.out.print("buzz");

            //break the line for readability ...
            System.out.println();
        }
    }
}
