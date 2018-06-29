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
    private Color color = Color.BLACK;
    private String vertebrate = "true";

    void purr() { }

    public Integer getSize() { return this.size; }

    public void setSize (int size) {
        if (size > 10) {
            System.out.println("panther2 size: " +size + ". this panther is too BIG! it can't be" +size + ", it must be 10 or below!");
            this.size = 10;
        }


        else {
            this.size = size;
        }

    }


    public Integer getNumberOfLegs() {
        return this.numberOfLegs; }


    public void setNumberOfLegs(int i) {
        if (i > 10) {
            System.out.println("Panther can't be bigger than 10");
            this.size = 5;
        } else {
            this.size = i;
        }
    }

    public String getCall() { return this.call; }

    public Color getColor()  {return this.color;}

    public Vertebrate getVertebrate() {return Vertebrate.MAMMAL; }
}
