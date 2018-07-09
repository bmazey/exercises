package patterns.factory;

public class MagicRoom extends Room {

    //TODO - implement methods!

    public int getNumberOfWalls() {
        return 6;
    }

    public void setNumberOfWalls(int numberOfWalls) {

    }

    public int getNumberOfDoors() {
        return 0;
    }

    public void setNumberOfDoors(int numberOfDoors) {

    }

    public String getColor() {
        return "Purple";
    }

    public void setColor(String color) {

    }

    public boolean isMirrored() {
        return true;
    }

    public void setMirrored(boolean mirrored) {

    }

    public String traverse() {
        return "Teleport";
    }
}
