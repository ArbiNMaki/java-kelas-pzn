package Lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Maki", "Katsuki", "Arbi", "Kalista"));

        // RemoveIf anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });
        System.out.println("anonymous class");
        System.out.println(names);

        // RemoveIf Lambda
        names.removeIf(name -> name.length() > 5);
        System.out.println("Lambda");
        System.out.println(names);
    }
}
