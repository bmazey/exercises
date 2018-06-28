package fundamentals.pizzeria;

import java.util.Arrays; //importing a method to be used after

public class PepperoniPizza {
    /**
     * these are the properties of our pizza!
     * Java give us a default constructor (there is already a method created automatically by Java)
     * new -> calls a class's constructor to instantiate an object
     * it manages memory in the JVM
     * this -> the specific instance (instance specific content)
     */
    int numberOfSlices;
    int size;
    String[] toppings;
    boolean isSquare;

    public PepperoniPizza() { // this is a constructor; it does not take arguments
        //default constructor (values); does not accept arguments
       this.numberOfSlices = 8;
       this.size = 3;
       this.toppings = new String[] { "pepperoni", "cheese", "tomato" };
       //the word new tells us how much space the JVM needs
       this.isSquare = false;
       //it takes zero arguments to call
    }

    public PepperoniPizza (int numberOfSlices, int size, String[] toppings, boolean isSquare) { //another constructor
        //this constructor gives 4 arguments
        //it let's you personalize your constructor
        this.numberOfSlices = numberOfSlices;
        this.size = size;
        this.toppings = toppings;
        this.isSquare = isSquare;
        // this -> reference instance specific data
    }

    public static void main (String[] args) {
        PepperoniPizza Pizza = new PepperoniPizza(); //keyword new is calling a method
        String[] toppings = {"vodka", "mozzarella", "tomato", "basil"};
        PepperoniPizza MyPizza = new PepperoniPizza(16, 5, toppings, true );
        //with MyPizza you are costuming the pizza
        // it is gonna call the PepperoniPizza constructor
        // there are two instances of PepperoniPizza; have the same properties but are not the same object
        System.out.println("Here is the number of slices for Pizza: " + Pizza.numberOfSlices);

        System.out.println("Here's the toppings for MyPizza: " + Arrays.toString(MyPizza.toppings));

        System.out.println("MyPizza slices: " + MyPizza.numberOfSlices);
    }
}
