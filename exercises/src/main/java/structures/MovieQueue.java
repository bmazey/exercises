package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {

        //TODO - implement this method!

        LinkedList<String> Movie = new LinkedList<String>();
        Movie.add("Leonardo");
        Movie.add("Donatello");
        Movie.add("Raphael");
        Movie.add("Michelangelo");


        return Movie;
    }
}
