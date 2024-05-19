package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Arbi");
        map.put("last", "Wijaya");
        map.put("middle", "Dwi");

        Set<String> keys = map.keySet();
        for(var key : keys) {
            System.out.println(key);
        }
    }
}
