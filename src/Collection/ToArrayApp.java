package Collection;

import java.util.Arrays;
import java.util.List;

public class ToArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Kalista", "Maki", "Arbi", "Katsuki");
        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
