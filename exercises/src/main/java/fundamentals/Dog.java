package fundamentals;

public class Dog {

    public String bark() {
        return "bark";
    }

    public int getNumberOfLegs() {
        return 4;
    }

    public int getNumberOfLegs(int i) {
        return i;
    }

    public double getNumberOfLegs(double i) {
        return i;
    }

    public String allDogsGoToHeaven() {
        return "all dogs go to heaven!";
    }

    // int[] array = {3,4,5};
    public static int sumArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }


    public static void main (String[] args) {
        Dog spot = new Dog();
        Dog rex = new Dog();

        int[] myArray = {1, 2, 3};

        System.out.println("value of s: " + spot.bark() + "\nnumber of legs: " + spot.getNumberOfLegs(6.5));

        /**
         * This is also a comment!
         */
        //System.out.println(spot.allDogsGoToHeaven());
        //test comment
    }
}
