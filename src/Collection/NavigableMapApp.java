package Collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Maki", "Maki");
        map.put("Arbi", "Arbi");
        map.put("Katsuki", "Katsuki");

        for(var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Katsuki"));
        System.out.println(map.higherKey("Katsuki"));
        System.out.println(map.floorKey("Katsuki"));
        System.out.println(map.ceilingKey("Katsuki"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for(var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Arbi", "Arbi"); // Error
    }
}
