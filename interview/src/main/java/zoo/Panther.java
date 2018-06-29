package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    //TODO - implement methods!

    private Integer size = 5;
    private Integer numberOfLegs = 4;
    private String call = "Roar";

    void purr() {}

    public Integer getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size > 10) {
            System.out.println("panther2 size: " +size + ". this panther is too big! it can't be " + size + ", it must be 10 or below!");
            this.size = 10;
        }

        else {
            this.size = size;
        }
    }

    public Integer getNumberOfLegs() { return this.numberOfLegs; }

    public void setNumberOfLegs(int numberOfLegs) {
        if (numberOfLegs != 4) {
            System.out.println("\nnumber of legs: " +numberOfLegs + ". a panther has 4 legs, not " + numberOfLegs);
            this.numberOfLegs = 4;
        }

        else {
            this.numberOfLegs = numberOfLegs;
        }
    }
    public String getCall() { return this.call; }


    public Color getColor() {
        return Color.BLACK;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}
