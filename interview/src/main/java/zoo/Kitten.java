package zoo;

import static zoo.Color.ORANGE;
import static zoo.Vertebrate.MAMMAL;

public class Kitten extends Cat{

    private Integer Size = 2;
    private Integer NumberOfLegs = 4;
    private String Call = "Miao";
    private Color Color = ORANGE;
    private Vertebrate Vertebrate = MAMMAL;


    void purr() {System.out.println("Purr"); }

    public Integer getSize() {
        return this.Size;
    }

    public Integer getNumberOfLegs() {
        return this.NumberOfLegs;
    }

    public String getCall() {
        return this.Call;
    }

    public Color getColor() {
        return this.Color;
    }

    public Vertebrate getVertebrate() {
        return this.Vertebrate;
    }

}

//This is almost like copy and paste from the Panther codes
//06.29.18 Coding Fin ><(((º>

