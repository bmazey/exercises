package zoo;

public abstract class Cat implements Animal {

    /**
     * Within this abstract class we can define default implementations of the methods we created in the interface.
     * In fact we're required to, because it implements Animal.
     *
     * Abstract classes can't be instantiated, which means we can't write ...
     *
     *                  X not allowed  ->  Cat myCat = new Cat();
     *
     * Unlike an interface, variables within this class are not necessarily final.
     */

    //TODO - implement variables!



    /**
     * The method below is an abstract method that is specific to Cat - it's not specified in the Animal interface!
     * Practically speaking, this means that any class that extends Cat needs to provide an implementation for this
     * method ...
     *
     * @return
     */

    //TODO - implement methods!

    abstract void purr();

}
