package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {

        //TODO - implement this method!
        Queue<String> movieQ = new LinkedList<String>();
        movieQ.add("Leonardo");
        movieQ.add("Donatello");
        movieQ.add("Raphael");
        movieQ.add("Michelangelo");

        return movieQ;
    }
}
