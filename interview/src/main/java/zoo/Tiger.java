package zoo;

public class Tiger extends Cat {

    void purr() {

    }
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
        return Color.ORANGE;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}
