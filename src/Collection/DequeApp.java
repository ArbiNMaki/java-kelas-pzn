package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerFirst("Arbi");
        deque.offerFirst("Dwi");
        deque.offerFirst("Wijaya");

        for(var value : deque) {
            System.out.println(value); // Descending: Wijaya, Dwi, Arbi
        }

        Deque<String> value = new LinkedList<>();
        value.offerLast("Bakugo");
        value.offerLast("Katsuki");

        for(var values : value) {
            System.out.println(values); // Ascending: Bakugo, Katsuki
        }
    }
}
