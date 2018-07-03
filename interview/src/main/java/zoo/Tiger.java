package zoo;

public class Tiger extends Cat {

    public String purr() {
        return "PowerPurr";
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

    public Color getColor() {
        return Color.ORANGE;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }
}
