package patterns.factory;

public class MagicRoom extends Room {

    //TODO - implement methods!

    private int numberOfWalls = 6;

    public int getNumberOfWalls() {
        return this.numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    private int numberOfDoors = 0;
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    private String color = "Purple";

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {

    }

    private boolean mirror = true;

    public boolean isMirrored() {
        return this.mirror;
    }

    public void setMirrored(boolean mirrored) {

    }

    private String  traverse = "Teleport";
    public String traverse() {
        return this.traverse;
    }
}
