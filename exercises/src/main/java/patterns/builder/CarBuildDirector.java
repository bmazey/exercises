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

        Car SUV = new Car();
        SUV.setColor("Yellow");
        SUV.setDoors(4);
        SUV.setWheels(4);
        SUV.setHasTrunk(true);
        SUV.setFuel("Unleaded Gas");

       return SUV;
    }

    public Car constructSportscar() {

        Car SportsCar = new Car();
        SportsCar.setColor("Red");
        SportsCar.setDoors(2);
        SportsCar.setWheels(4);
        SportsCar.setHasTrunk(false);
        SportsCar.setFuel("Premium Gas");

        return SportsCar;
    }

    public Car constructEighteenWheeler() {

        Car EighteenWheeler = new Car();
        EighteenWheeler.setColor("Blue");
        EighteenWheeler.setDoors(2);
        EighteenWheeler.setWheels(18);
        EighteenWheeler.setHasTrunk(false);
        EighteenWheeler.setFuel("Diesel");

        return EighteenWheeler;
    }

    public Car constructTesla() {

        Car Tesla = new Car();
        Tesla.setColor("Black");
        Tesla.setDoors(4);
        Tesla.setWheels(4);
        Tesla.setHasTrunk(true);
        Tesla.setFuel("Electricity");

        return Tesla;
    }

}
