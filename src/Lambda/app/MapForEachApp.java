package Lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Arbi");
        map.put("middle_name", "Dwi");
        map.put("last_name", "Wijaya");

        // For Loop
        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // ForEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // Lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
