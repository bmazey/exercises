package zoo;

public class Zoo {

    /**
     * This Zoo class contains the main method - maybe we should try putting our animals here?
     * @param args
     */

    public static void main(String [] args) {
        Panther panther1 = new Panther();
        Panther panther2 = new Panther();

        //panther.size()
        //cant do panther.size() bc the size variable is private

        //panther1.getSize();
        //can do panther.getSize() bc getSize is a public method so you can get the value out. this also means the size cant be changed

        System.out.println("panther1 size: " + panther1.getSize() + "\npanther2 size: " + panther2.getSize());

        //changing panther2 size
        panther2.setSize(11);
        System.out.println("\npanther1 size: " + panther1.getSize() + "\npanther2 size: " + panther2.getSize());

        //changing panther2 legs
        panther2.setNumberOfLegs(5);
        System.out.println("panther1 number of legs: " + panther1.getNumberOfLegs() + "\npanther2 number of legs: "+ panther2.getNumberOfLegs());

    }
}

