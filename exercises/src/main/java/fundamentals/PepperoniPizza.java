package fundamentals;

import java.util.Arrays;

public class PepperoniPizza {

    /**
     * these are the properties of our pizza!
     */

    int numberOfSlices;
    int size;
    String[] toppings;
    boolean isSquare;

    public PepperoniPizza() {
        this.numberOfSlices = 8;
        this.size = 3;
        this.toppings = new String[]{"pepperoni", "cheese", "tomato"};
        this.isSquare = false;
    }

    public PepperoniPizza(int numberOfSlices, int size, String[] toppings, boolean isSquare) {
        this.numberOfSlices = numberOfSlices;
        this.size = size;
        this.toppings = toppings;
        this.isSquare = isSquare;
    }

    public static void main(String[] args) {

        String[] toppings = {"vodka", "mozzarella", "tomato", "basil"};

        PepperoniPizza WhitePie = new PepperoniPizza();
        PepperoniPizza Grandma = new PepperoniPizza(16, 3, toppings, true);

        System.out.println("Here's the WhitePie toppings: " + Arrays.toString(WhitePie.toppings));
        System.out.println("Here's the Grandma toppings: " + Arrays.toString(Grandma.toppings));

        if (WhitePie.size == Grandma.size) {
            System.out.println("same sizes!" + WhitePie.size);
        }
        
        if (WhitePie.numberOfSlices == Grandma.numberOfSlices) {
            System.out.println("same slices!" + WhitePie.numberOfSlices);
        }

        //test
    }
}
