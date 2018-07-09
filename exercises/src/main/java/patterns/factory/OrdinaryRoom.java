package patterns.factory;

public class OrdinaryRoom extends Room {

    //TODO - implement methods!

    private int numberOfWalls = 4;

    public int getNumberOfWalls() {
        return this.numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    private int numberOfDoors = 2;

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    private String color = "White";
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {

    }

    private boolean mirrored = false;
    public boolean isMirrored() {
        return this.mirrored;
    }

    public void setMirrored(boolean mirrored) {

    }
    private String traverse = "Open Door";
    public String traverse() {
        return this.traverse;
    }
}