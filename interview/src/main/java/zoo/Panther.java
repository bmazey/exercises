package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

     private Integer size = 5;
     private Integer numOfLegs = 4;
     private String call = "Roar";



    void purr() {
        System.out.println("purrr");
    }

    public Integer getSize() {

        return this.size;
    }

    public Integer getNumberOfLegs() {

        return this.numOfLegs;
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
