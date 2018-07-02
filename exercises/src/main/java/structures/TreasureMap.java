package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {

    }

    public Map<String, String> createTreasureMap() {

        Map <String, String>TreasureMap = new HashMap();

        //Putting keys and values in
        TreasureMap.put ("beach", "sandy shores");
        TreasureMap.put ("coast", "ocean reef");
        TreasureMap.put ("volcano", "hot lava");
        TreasureMap.put ("x", "marks the spot");

        //Testing
        System.out.println (TreasureMap.get("beach"));

        return TreasureMap;
    }
}

//07.02.18 Coding Fin ><(((('>
