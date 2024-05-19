package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BInarySearchApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(1000);

        for(int i = 1; i < 1000; i++) {
            numbers.add(i);
        }

        int index = Collections.binarySearch(numbers, 777);
        System.out.println(index);
    }
}
