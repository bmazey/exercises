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

        Car mySuv = new Car();
        mySuv.setColor("Yellow");
        mySuv.setDoors(4);
        mySuv.setWheels(4);
        mySuv.setHasTrunk(true);
        mySuv.setFuel("Unleaded Gas");
        //TODO - implement this method! :)

       return mySuv;
    }

    public Car constructSportscar() {

        Car mySportsCar = new Car();
        mySportsCar.setColor("Red");
        mySportsCar.setDoors(2);
        mySportsCar.setWheels(4);
        mySportsCar.setHasTrunk(false);
        mySportsCar.setFuel("Premium Gas");

        //TODO - implement this method! :)

        return mySportsCar;
    }

    public Car constructEighteenWheeler() {

        Car myEighteenWheeler = new Car();
        myEighteenWheeler.setColor("Blue");
        myEighteenWheeler.setDoors(2);
        myEighteenWheeler.setWheels(18);
        myEighteenWheeler.setHasTrunk(false);
        myEighteenWheeler.setFuel("Diesel");

        //TODO - implement this method! :)

        return myEighteenWheeler;
    }

    public Car constructTesla() {

        Car myTesla = new Car();
        myTesla.setColor("Black");
        myTesla.setDoors(4);
        myTesla.setWheels(4);
        myTesla.setHasTrunk(true);
        myTesla.setFuel("Electricity");

        //TODO - implement this method! :)

        return myTesla;
    }

}
