package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {

        Queue<String> MovieQueue = new LinkedList();
        //Adding strings into queue
        MovieQueue.add("Leonardo");
        MovieQueue.add("Donatello");
        MovieQueue.add("Raphael");
        MovieQueue.add("Michelangelo");

        return MovieQueue;
    }
}
