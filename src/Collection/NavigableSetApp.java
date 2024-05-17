package Collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Arbi", "Dwi", "Wijaya", "Bakugo", "Katsuki", "Nishikino", "Maki"));

        NavigableSet<String> namesReverse = names.descendingSet();

        NavigableSet<String> head = names.headSet("Dwi", true);
        NavigableSet<String> tail = names.tailSet("Bakugo", true);

//        for(var name : names) {
//            System.out.println(name);
//        }

//        for(var name : namesReverse) {
//            System.out.println(name);
//        }

        for(var name : tail) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Ups");
    }
}
