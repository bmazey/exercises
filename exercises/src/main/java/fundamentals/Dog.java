package fundamentals;

public class Dog {

    public String bark() {
        return "bark";
    }

    public int getNumberOfLegs() {
        return 4;
    }

    public static void main (String[] args) {
        Dog spot = new Dog ();

       // System.out.printIn("value of s: " + spot.bark() + " number of legs: " + spot.getNumberOfLegs())
    }
}