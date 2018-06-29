package zoo;

public class Tiger extends Cat { //this is saying that Tiger is a type of cat
   public String purr() {
        return "Rauu";
    }

    public Integer getSize() {
       return 4;
    }

    public Integer getNumberOfLegs() {
       return 4;
    }

    public String getColor() {
       return "ORANGE";
    }

    public String getCall() {
       return "Rauu";
    }

    public String getVertebrate() {
       return "Mammal"; // why can't I return MAMMAL?
    }
}
