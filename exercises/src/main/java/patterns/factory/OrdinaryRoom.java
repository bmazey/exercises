package patterns.factory;

public class OrdinaryRoom extends Room {

    //TODO - implement methods!

    public int getNumberOfWalls() {
        return 4;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    public int getNumberOfDoors() {
        return 2;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    public String getColor() {
        return "White";
    }

    public void setColor(String color) {

    }

    public boolean isMirrored() {
        return false;
    }

    public void setMirrored(boolean mirrored) {

    }

    public String traverse() {
        return "Open Door";
    }
}