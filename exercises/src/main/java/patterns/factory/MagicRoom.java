package patterns.factory;

public class MagicRoom extends Room {

    private int numberOfWalls = 6;
    private int numberOfDoors = 0;
    private String color = "Purple";
    private boolean mirrored = true;
    private String magicTraverse = "Teleport";



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
        return magicTraverse;
    }
}
