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

        //TODO - implement this method! :)

       return new Car();
    }

    public Car constructSportscar() {

        //TODO - implement this method! :)

        return new Car();
    }

    public Car constructEighteenWheeler() {

        //TODO - implement this method! :)

        return new Car();
    }

    public Car constructTesla() {

        //TODO - implement this method! :)

        return new Car();
    }

}
