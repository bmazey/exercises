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
        builder.setHasTrunk(true);
        builder.setFuel("Unleaded Gas");
        builder.setDoors(4);
        builder.setColor("Yellow");
        builder.setWheels(4);

        //TODO - implement this method! :)

       return builder.setWheels(4)
        .setColor("Yellow")
        .setDoors(4)
        .setFuel("Unleaded Gas")
        .setHasTrunk(true)
        .build();
    }

    public Car constructSportscar() {
        builder.setHasTrunk(false);
        builder.setFuel("Premium Gas");
        builder.setDoors(2);
        builder.setColor("Red");
        builder.setWheels(4);

        //TODO - implement this method! :)

        return builder.setHasTrunk(false)
        .setFuel("Premium Gas")
        .setDoors(2)
        .setColor("Red")
        .setWheels(4)
        .build();
    }

    public Car constructEighteenWheeler() {
        builder.setHasTrunk(false);
        builder.setFuel("Diesel");
        builder.setDoors(2);
        builder.setColor("Blue");
        builder.setWheels(18);

        //TODO - implement this method! :)

        return builder.setHasTrunk(false)
                .setFuel("Diesel")
                .setDoors(2)
                .setColor("Blue")
                .setWheels(18)
                .build();
    }

    public Car constructTesla() {
        builder.setHasTrunk(true);
        builder.setFuel("Electricity");
        builder.setDoors(4);
        builder.setColor("Black");
        builder.setWheels(4);

        //TODO - implement this method! :)

        return builder.setHasTrunk(true)
                .setFuel("Electricity")
                .setDoors(4)
                .setColor("Black")
                .setWheels(4)
                .build();
    }


}
