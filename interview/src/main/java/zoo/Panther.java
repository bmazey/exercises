package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    //TODO - implement methods!


    void purr() { }

    public Integer getSize() {
        return 5;
    }

    public Integer getNumberOfLegs() {
        return 4;
    }
    //Returning NumberOfLegs 4

    public String getCall() {
        return "Roar";
    }
    //Returning Roar(like in test)

    public Color getColor() {
        return Color.BLACK;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}
