package zoo;

public class Zoo {

    /**
     * This Zoo class contains the main method - maybe we should try putting our animals here?
     * @param args
     */

    public static void main(String [] args) {
        Panther panther1 = new Panther();
        Panther panther2 = new Panther();



        Owl snowyOwl = new Owl();

        snowyOwl.setSize(1000);
        snowyOwl.setNumberOfLegs(1);
        snowyOwl.setCall("Hoot");
    }
}
