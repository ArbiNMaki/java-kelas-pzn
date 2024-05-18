package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
        Queue<String> prior = new PriorityQueue<>();

        prior.add("Dwi");
        prior.add("Arbi");
        prior.add("Wijaya");

        for(String next = prior.poll(); next != null; next = prior.poll()) {
            System.out.println(next);
        }

        System.out.println(prior.size());
    }
}
