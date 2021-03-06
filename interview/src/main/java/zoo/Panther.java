package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    //TODO - implement methods!
    //int legs = 4;

    private Integer size = 5;
    private Integer numberOfLegs = 4;
    private String call = "Roar";

    void purr() {System.out.println("Purr"); }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size > 10) {
            System.out.println("this panther is too big!");
            this.size = 10;
        }
        else {
            this.size = size;
        }
    }

    public Integer getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public String getCall() {
        return this.call;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}
