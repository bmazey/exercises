package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {
        MovieQueue myMovieQueue = new MovieQueue();
        Queue<String> myQueue = myMovieQueue.createMovieQueue();
        myQueue.add("Leonardo");
        myQueue.add("Donatello");
        myQueue.add("Raphael");
        myQueue.add("Michelangelo");

        myQueue.size();
        //TODO - implement this method!

        return new LinkedList<String>();
    }
}
