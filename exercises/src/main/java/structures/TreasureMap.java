package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {
        HashMap<String,String> TreasureMap = new HashMap();
        TreasureMap.put("beach","sandy shores");
        TreasureMap.put("coast","ocean reef");
        System.out.println(TreasureMap.get("beach"));

    }

    public Map<String, String> createTreasureMap() {

        //TODO - implement this method!
        HashMap<String,String> TreasureMap = new HashMap();
        TreasureMap.put("beach","sandy shores");
        TreasureMap.put("coast","ocean reef");
        TreasureMap.put("volcano","hot lava");
        TreasureMap.put("x", "marks the spot");
        return TreasureMap;
    }
}
