package patterns.factory;

public class OrdinaryRoom extends Room {

    private int NumberOfWalls = 4;
    private int NumberOfDoors = 2;
    private String traverse = "Open Door";
    private String color = "White";
    private boolean isMirrored = false;

    public int getNumberOfWalls() {
        return this.NumberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
    }

    public boolean isMirrored() {
        return isMirrored;
    }

    public void setMirrored(boolean mirrored) {

    }

    public String traverse() {
        return traverse;
    }
}