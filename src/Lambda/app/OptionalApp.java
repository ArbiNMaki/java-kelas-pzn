package Lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Arbi");
        sayHello(null);
    }

    public static void sayHello(String name) {
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("BOS");

        System.out.println("HELLO " + upperName);

        // 1 Baris
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );

        // 3 Baris
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> upperName = optionalName.map(String::toUpperCase);
//        upperName.ifPresent(value -> System.out.println("HELLO " + value));
    }
}
