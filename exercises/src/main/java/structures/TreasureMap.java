package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {

    }

    public Map<String, String> createTreasureMap() {
        Map<String, String> mapTreasureMap = new HashMap();

        mapTreasureMap.put("beach", "sandy shores");
        mapTreasureMap.put("coast", "ocean reef");
        mapTreasureMap.put("volcano", "hot lava");
        mapTreasureMap.put("x", "marks the spot");

        System.out.println(mapTreasureMap);

        return mapTreasureMap;
    }
}