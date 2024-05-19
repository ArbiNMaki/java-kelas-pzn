package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name.first", "Arbi");
        map.put("name.middle", "Dwi");
        map.put("name.last", "Wijaya");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
