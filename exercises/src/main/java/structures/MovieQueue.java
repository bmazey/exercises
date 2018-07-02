package structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {

        Queue<String> MovieQueue = new LinkedList<String>();
            MovieQueue.add("Leonardo");
            MovieQueue.add("randomPerson");
            MovieQueue.add("Donatello");
            MovieQueue.add("randomPerson2");
            MovieQueue.add("randomPerson3");
            MovieQueue.add("Raphael");
            MovieQueue.add("randomPerson4");
            MovieQueue.add("Michelangelo");

        //TODO - implement this method!

        return MovieQueue;
    }
}
