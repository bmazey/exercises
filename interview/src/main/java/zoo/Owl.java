package zoo;

public class Owl extends Bird {

    private int size = 3;
    private int numberOfLegs = 2;
    private String call = "Chirp";

    void chirp() {
    }
        public Integer getSize() {
            return this.size;
        }

        public void setSize(int s)

        {
            this.size = s;
            if (size > 10) {
                System.out.println("Your bird's sheer size caused it to be reclassified as a dinosaur.");
                this.size = 0;
                if (size > 100)
                    System.out.println("Your bird was much too large and has collapsed into a black hole.");
                this.size = 0;
            } else {
                this.size = s;
                System.out.println("Your bird is of a standard size.");
            }
        }


    public Integer getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int l)

    {
        this.numberOfLegs = l;
            if (numberOfLegs == 1)
                System.out.println("Your bird has some problems, but it can probably still fly fine with " + l + " leg.");
            if (numberOfLegs > 2)
                System.out.println("Your bird is going to have some problems, considering it has " + l + " legs.");
            if (numberOfLegs == 2)
                System.out.println("Your bird has the standard number of legs.");
            if (numberOfLegs == 0)
                System.out.println("Who needs legs, anyways?");
        if (numberOfLegs < 0)
            System.out.println("That's a highly unusual amount of legs.");
            this.numberOfLegs = l;
            }

        public String getCall() {
            return this.call;
        }

    public void setCall(String birdCall)

    {
        call = birdCall;
        System.out.println("Your bird makes a "+ call + " sound.");
    }


        public Color getColor() {
            return Color.BLACK;
        }

        public Vertebrate getVertebrate() {
            return Vertebrate.MAMMAL;
        }
    }



