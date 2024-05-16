package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // Menambah Data
        names.add("Arbi");
        names.add("Dwi");
        names.add("Wijaya");
        names.addAll(List.of("Malang", "Jatim", "Indo")); // List.of()
        names.addAll(Arrays.asList("Malang", "Jawa Timur", "Indonesia")); // Arrays.asList()

        for(var name : names) {
            System.out.println(name);
        }

        // Menghapus Data
        System.out.println("=== Setelah Dihapus ===");
        names.remove("Jatim");
        names.removeAll(List.of("Malang", "Indonesia"));
        names.removeAll(Arrays.asList("Malang", "Indo"));

        for(var name : names) {
            System.out.println(name);
        }

        // Cek data, apakah datanya ada atau tidak
        System.out.println("=== Cek Data (True:Ada) (False:Tidak ada) ===");
        System.out.println(names.contains("Wijaya"));
        System.out.println(names.contains("Katsuki"));
        System.out.println(names.containsAll(List.of("Dwi", "Jawa Timur")));
    }
}
