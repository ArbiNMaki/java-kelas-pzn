package Collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Arbi", "Dwi", "Wijaya");
        Iterator<String> iterator = names.iterator();

        System.out.println("--- Iterable ---");
        for(var name : names) {
            System.out.println(name);
        }

        System.out.println("=== Iterator ===");
        while(iterator.hasNext()) {
            String nama = iterator.next();
            System.out.println(nama);
        }
    }
}
