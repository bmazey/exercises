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

        Car car = new Car();
        car.setColor("Yellow");
        car.setDoors(4);
        car.setWheels(4);
        car.setFuel("Unleaded Gas");
        car.setHasTrunk(true);

       return car;
    }

    public Car constructSportscar() {

        Car car = new Car();
        car.setColor("Red");
        car.setHasTrunk(false);
        car.setFuel("Premium Gas");
        car.setWheels(4);
        car.setDoors(2);

        return car;
    }

    public Car constructEighteenWheeler() {

       Car car = new Car();
       car.setColor("Blue");
       car.setDoors(2);
       car.setWheels(18);
       car.setFuel("Diesel");
       car.setHasTrunk(false);

        return car;
    }

    public Car constructTesla() {

        Car car = new Car();
        car.setColor("Black");
        car.setDoors(4);
        car.setHasTrunk(true);
        car.setFuel("Electricity");
        car.setWheels(4);

        return car;
    }

}
