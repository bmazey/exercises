package patterns.factory;

public class OrdinaryRoom extends Room {

    private int numberOfWalls = 4;
    private int numberOfDoors = 2;
    private String color = "White";
    private boolean mirrored = false;
    private String ordinaryTraverse = "Open Door";

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

    }

    public boolean isMirrored() {
        return mirrored;
    }

    public void setMirrored(boolean mirrored) {

    }

    public String traverse() {
        return ordinaryTraverse;
    }
}