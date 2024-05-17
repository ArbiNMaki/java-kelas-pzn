package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> listArrayList = new ArrayList<>();
        List<String> listLinkedList = new LinkedList<>();

        listArrayList.add("Arbi");
        listArrayList.add("Dwi");
        listArrayList.add("Wijaya");

        listArrayList.set(0, "Kalista");

        listArrayList.remove(2);

        System.out.println(listArrayList.get(0));

        for(var value : listArrayList) {
            System.out.println(value);
        }

        listLinkedList.add("Bakugo");
        listLinkedList.add("Katsuki");

        listLinkedList.set(1, "Maki");

        listLinkedList.remove(0);

        System.out.println(listLinkedList.get(0));

        for(var value : listLinkedList) {
            System.out.println(value);
        }
    }
}
