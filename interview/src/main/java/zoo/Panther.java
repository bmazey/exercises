package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    String call = "ROAR";

    void purr() { }

    public Integer getSize() {
        return 5;
    }

    public Integer getNumberOfLegs() {
        return 4;
    }

    public String getCall() {
        return call;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}

/** I'm not sure if I cheated here somewhere. Since the test wanted a size of 5 and 4 legs, I filled that into the first
 *  returns. I made a string with "ROAR" to satisfy getCall, and I used the Color and Vertebrate responses from the other classes
 *  for the last two returns.
 */


