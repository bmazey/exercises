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

    void purr() {System.out.println("Purr"); }

    public Integer getSize() { return this.size; }

    public void setSize(int i) {
        this.size = i;
    }

    public Integer getNumberOfLegs() {

        return this.numberOfLegs;
    }

    public String getCall() {

        return this.;
    }

    public Color getColor() {

        return this.;
    }

    public Vertebrate getVertebrate() {

        return this.;
    }
}
