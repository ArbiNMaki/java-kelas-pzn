package Collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> names = List.of("Kalista", "Maki", "Arbi", "Katsuki");
        Spliterator<String> split1 = names.spliterator();
        Spliterator<String> split2 = split1.trySplit();

        System.out.println(split1.estimateSize());
        System.out.println(split2.estimateSize());

        split1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        split2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
