package Collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2)); // True
        System.out.println(key1 == key2); // False

        map.put(key1, "Arbi");
        map.put(key2, "Arbi");

        System.out.println(map.size()); // 2
    }
}
