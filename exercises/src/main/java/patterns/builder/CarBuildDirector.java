package patterns.builder;

public class CarBuildDirector {
    /**
     * This is just an example of how to use a "director" class to use the builder pattern.
     *
     */
    private CarBuilder builder;

    public CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSUV() {

        Car c = new Car();
        c.setColor("Yellow");
        c.setDoors(4);
        c.setWheels(4);
        c.setHasTrunk(true);
        c.setFuel("Unleaded Gas");

       return c;
    }

    public Car constructSportscar() {

        Car c = new Car();
        c.setColor("Red");
        c.setDoors(2);
        c.setWheels(4);
        c.setHasTrunk(false);
        c.setFuel("Premium Gas");

        return c;
    }

    public Car constructEighteenWheeler() {

        Car c = new Car();
        c.setColor("Blue");
        c.setDoors(2);
        c.setWheels(18);
        c.setHasTrunk(false);
        c.setFuel("Diesel");

        return c;
    }

    public Car constructTesla() {

        Car c = new Car();
        c.setColor("Black");
        c.setDoors(4);
        c.setWheels(4);
        c.setHasTrunk(true);
        c.setFuel("Electricity");

        return c;
    }

}
