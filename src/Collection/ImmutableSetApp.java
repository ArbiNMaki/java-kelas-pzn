package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();

        Set<String> satu = Collections.singleton("Arbi");

        Set<String> mutable = new HashSet<>();
        mutable.add("Arbi");
        mutable.add("Dwi");
        mutable.add("Wijaya");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> manual = Set.of("Arbi", "Dwi", "Wijaya");

//        manual.remove("Arbi"); // Error
//        manual.add("Malang"); // Error
    }
}
