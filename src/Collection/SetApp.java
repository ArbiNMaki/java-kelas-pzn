package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); // Random
//        Set<String> names = new LinkedHashSet<>(); // Berurutan

        names.add("Arbi");
        names.add("Dwi");
        names.add("Wijaya");
        names.add("Arbi");
        names.add("Dwi");
        names.add("Wijaya");
        names.add("Bakugo");
        names.add("Katsuki");
        names.add("Bakugo");
        names.add("Katsuki");
        names.add("Nishikino");
        names.add("Maki");
        names.add("Nishikino");
        names.add("Maki");

        for(var name : names) {
            System.out.println(name);
        }
    }
}
