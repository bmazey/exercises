package zoo;

public abstract class Cat implements Animal {

    public Integer getSize() {
        return 2;
    }

    public Integer getNumberOfLegs() {
        return 4;
    }

    public String getCall() {
        return "meow";
    }

    public Color getColor() {
        return Color.ORANGE;
    }

    public Vertebrate getVertebrate() {
        return Vertebrate.MAMMAL;
    }

    public abstract String purr();
}
