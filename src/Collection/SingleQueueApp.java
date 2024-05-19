package Collection;

import Collection.Abstract.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        queue.offer("Arbi");
        queue.offer("Dwi");
        queue.offer("Wijaya");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
