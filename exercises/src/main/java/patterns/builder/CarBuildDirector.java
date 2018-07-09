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
        Car mySUV = new Car();
        mySUV.setColor("Yellow");
        mySUV.setDoors(4);
        mySUV.setWheels(4);
        mySUV.setHasTrunk(true);
        mySUV.setFuel("unleaded gas");

        //TODO - implement this method! :)

       return mySUV;
    }

    public Car constructSportscar() {
        Car mySportscar = new Car();
        mySportscar.setColor("Red");
        mySportscar.setDoors(2);
        mySportscar.setWheels(4);
        mySportscar.setHasTrunk(false);
        mySportscar.setFuel("premium gas");

        //TODO - implement this method! :)

        return mySportscar;
    }

    public Car constructEighteenWheeler() {
        Car myEighteenWheeler = new Car();
        myEighteenWheeler.setColor("Blue");
        myEighteenWheeler.setDoors(2);
        myEighteenWheeler.setWheels(18);
        myEighteenWheeler.setHasTrunk(false);
        myEighteenWheeler.setFuel("diesel");

        //TODO - implement this method! :)

        return myEighteenWheeler;
    }

    public Car constructTesla() {
        Car myTesla = new Car();
        myTesla.setColor("Black");
        myTesla.setDoors(4);
        myTesla.setWheels(4);
        myTesla.setHasTrunk( true );
        myTesla.setFuel("Electricity");

        //TODO - implement this method! :)

        return myTesla;
    }

}
