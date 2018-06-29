package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    //TODO - implement methods!

    String purr(){
        return "Roar";
    }

    public Integer getSize() {
        return 5;
    }

    public Integer getNumberOfLegs() {
        return 4;
    }

    public String getCall() {
        return "Roar";
    }

    public String getColor() {
        return "BLACK";
    }

    public Vertebrate getVertebrate() {
        return null;
    }
}
