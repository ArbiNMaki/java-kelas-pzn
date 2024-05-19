package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Maki", "Bakugo", "Arbi", "Kalista"));
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);
    }
}
