package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Katsuki", "Katsuki");
        map.put("Arbi", "Arbi");
        map.put("Maki", "Maki");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
