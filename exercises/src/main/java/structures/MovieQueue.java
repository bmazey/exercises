package structures;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {

    public static void main (String[] args) {

    }

    public Queue<String> createMovieQueue() {

        //TODO - implement this method!
        Queue movieQueue = new LinkedList();

    ((LinkedList) movieQueue).add("Leonardo");
    ((LinkedList) movieQueue).add("Donatello");
    ((LinkedList) movieQueue).add("Raphael");
    ((LinkedList) movieQueue).add("Michelangelo");




        return movieQueue;
    }
}
