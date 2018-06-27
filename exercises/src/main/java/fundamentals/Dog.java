package fundamentals;

public class Dog {

    public String bark() { //anyone can call bark
        String dogSound = "bark" ;
        return dogSound ;
    }
    public int getNumberOfLegs() { // it returns an int and does not accept any values
        return 4 ;
    }

    public int getNumberOfLegs(int i){ // this one accepts an integer
        return i ;
    }

    public double getNumberOfLegs(double i) {
        return i ;
    }

    public static void main (String[] args) { // now you can actually run it
        Dog spot = new Dog() ;
        Dog rex = new Dog() ;
        String s = spot.bark() ;

        System.out.println("value of s: " + s) ;

        System.out.println("value of s : " + spot.bark() + " \nnumber of legs: " + spot.getNumberOfLegs(5)) ;

        System.out.println(spot.allDogsGoToHaven()) ; // the string needs to be static or need an instance of dog
    }

    public String barkk() {
        return "barkk" ;
    }


    public String allDogsGoToHaven() {
        return "all dogs go to heaven" ;
    }

}
