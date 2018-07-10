package patterns.factory;

public class MagicRoom extends Room {

    //TODO - implement methods!

    private int numberOfWalls = 6;
    private int numberOfDoors = 0;
    private String Color = "Purple";
    private boolean isMirrored = true;
    private String traverse = "Teleport";




    public int getNumberOfWalls() {
        return this.numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {

        this.numberOfDoors = numberOfWalls;
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
