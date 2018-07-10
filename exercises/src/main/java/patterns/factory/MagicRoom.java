package patterns.factory;

public class MagicRoom extends Room {
    private int NumberOfWalls=6;
    private int NumberOfDoors=0;
    private String traverse="Teleport";
    private String color="Purple";
    private boolean isMirrored=true;

    public int getNumberOfWalls() {
        return this.NumberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
    }

    public int getNumberOfDoors() {
        return this.NumberOfDoors;
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
