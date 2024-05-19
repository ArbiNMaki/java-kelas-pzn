package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Katsuki", "Arbi", "Maki"));

        Collections.sort(names);

        for(var value : names) {
            System.out.println(value);
        }

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for(var value : names) {
            System.out.println(value);
        }
    }
}
