package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Arbi");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Arbi");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Arbi",
                "middle", "Dwi",
                "last", "Wijaya"
        );
//        map.put("a", "A"); // Error
    }
}
