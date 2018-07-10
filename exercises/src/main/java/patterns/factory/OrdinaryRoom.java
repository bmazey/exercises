package patterns.factory;

public class OrdinaryRoom extends Room {


    //TODO - implement methods!
    private int numberOfWalls = 4;
    private int numberOfDoors = 2;
    private String Color = "White";
    private boolean isMirrored = false;
    private String traverse = "Open Door";


    public int getNumberOfWalls() {


        return this.numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;

    }

    public int getNumberOfDoors() {

        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {

        return this.Color;
    }

    public void setColor(String color) {

        this.Color = Color;

    }

    public boolean isMirrored() {

        return this.isMirrored;
    }

    public void setMirrored(boolean mirrored) {

        this.isMirrored = isMirrored;

    }

    public String traverse() {
        return this.traverse;
    }
}