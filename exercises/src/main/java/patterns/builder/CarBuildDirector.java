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


        return builder.setWheels(4)
                .setColor("Yellow")
                .setHasTrunk(true)
                .setFuel("Unleaded Gas")
                .setDoors(4)
                .build();
    }

    public Car constructSportscar() {

        //TODO - implement this method! :)

        return builder.setWheels(4)
                .setColor("Red")
                .setHasTrunk(false)
                .setFuel("Premium Gas")
                .setDoors(2)
                .build();
    }

    public Car constructEighteenWheeler() {

        //TODO - implement this method! :)

        return builder.setWheels(18)
                .setColor("Blue")
                .setHasTrunk(false)
                .setFuel("Diesel")
                .setDoors(2)
                .build();
    }

    public Car constructTesla() {

        //TODO - implement this method! :)

        return builder.setWheels(4)
                .setColor("Black")
                .setHasTrunk(true)
                .setFuel("Electricity")
                .setDoors(4)
                .build();
    }

}
