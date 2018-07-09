package patterns.factory;

public class MagicRoom extends Room {

    //TODO - implement methods!
    Room magicRoom = new MagicRoom();
    public int getNumberOfWalls() {
        return 0;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        magicRoom.setNumberOfWalls(6);
    }

    public int getNumberOfDoors() {
        return 0;
    }

    public void setNumberOfDoors(int numberOfDoors) {
       magicRoom.setNumberOfDoors(0);
    }

    public String getColor() {
        return null;
    }

    public void setColor(String color) {
      magicRoom.setColor("Purple");
    }

    public boolean isMirrored() {
        return false;
    }

    public void setMirrored(boolean mirrored) {
      magicRoom.setMirrored(true);
    }

    public String traverse() {
        return "Teleport";
    }

}
