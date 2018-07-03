package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {

    }



    public Map <String, String> createTreasureMap() {
        HashMap<String,String > myMap = new HashMap<String, String>();
        //TODO - implement this method!

             myMap.put("beach","sandy shores");
             myMap.put("coast","ocean reef");
             myMap.put("volcano","hot lava");
             myMap.put("x","marks the spot");


        return myMap;
    }
}
