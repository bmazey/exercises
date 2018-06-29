package zoo;

public class Zoo {

    /**
     * This Zoo class contains the main method - maybe we should try putting our animals here?
     * @param args
     */

    public static void main(String [] args) {
        Panther panther1 = new Panther();
        Panther panther2 = new Panther();

        System.out.println("panther1 size: " + panther1.getSize() + " panther2 size: " + panther2.getSize());

        panther2.setSize(7);

        System.out.println("panther1 size: " + panther1.getSize() + " panther2 size: " + panther2.getSize());

        System.out.println("panther2 legs: " + panther2.getNumberOfLegs());

        panther2.setNumberOfLegs(5);

        System.out.println("panther2 legs: " + panther2.getNumberOfLegs());

        panther1.setSize(11);

        System.out.println("panther1 size: " + panther1.getSize());

    }
}