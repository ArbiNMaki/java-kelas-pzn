package Lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Arbi", "Dwi", "Wijaya");

        // For Loop
        for(var value : list) {
            System.out.println(value);
        }

        // ForEach anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Lambda
        list.forEach(value -> System.out.println(value));

        // Lambda Method Reference
        list.forEach(System.out::println);
    }
}
