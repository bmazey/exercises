package zoo;

import static zoo.Color.BLACK;
import static zoo.Vertebrate.MAMMAL;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */

    //TODO - implement methods!
    private Integer Size = 5;
    private Integer NumberOfLegs = 4;
    private String Call = "Roar";
    private Color Color = BLACK;
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

//Change into more useful version
//Private variables are safer
//This module could be used for almost any animal
//06.29.18 Coding Fin ><(((º>
