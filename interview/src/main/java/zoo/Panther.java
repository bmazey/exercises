package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    private Integer size = 5;
    private Integer numberOfLegs = 4;
    private String call = "Roar";
    private String color = "BLACK";
    private String vertebrate = "true";

    void purr() { }

    public Integer getSize() {return this.size;}

    public void setSize(int i) {
        if (i > 10) {
            System.out.println("Panthers can't be bigger than 10!");
            this.size = 5;
        }
        else {
            this.size = i;
        }
    }

    public Integer getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int i){
        this.numberOfLegs = i;
    }

    public String getCall() {return this.call;}

    public String getColor() {return this.color;}

    public String getVertebrate() {return this.vertebrate;
    }
}