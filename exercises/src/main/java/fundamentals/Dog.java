package fundamentals;

public class Dog {

    public String bark() {
        return "bark";

    }

    public int numberLegs() {
        return 4;
    }

    public static String allDogsGoToHeaven() {
        return "all dogs go to heaven!";
    }
    public static void main (String[] args) {
        Dog spot = new Dog();
        Dog rex = new Dog();

        int [] myArray = (1,2,3)

        System.out.println("value of s: " + spot.bark() + "\nnumber of legs: " + spot.numberLegs());

        System.out.println(spot.allDogsGoToHeaven());
    }
}
