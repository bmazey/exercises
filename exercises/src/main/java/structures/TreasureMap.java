package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {

    }

    public Map<String, String> createTreasureMap() {

        Map<String, String> tm = new HashMap();
tm.put("beach", "sandy shores");
tm.put("coast", "ocean reef");
tm.put("volcano", "hot lava");
tm.put("x", "marks the spot");
        return tm;
    }

    /*public String get(String input)
    {
        String output = "";
        if(input.contentEquals("beach"))
            output = "sandy shores";
        if(input.contentEquals("coast"))
            output = "ocean reef";
        if(input.contentEquals("volcano"))
            output = "hot lava";
        if(input.contentEquals("x"))
            output = "marks the spot";
        return output;
    }*/
}

