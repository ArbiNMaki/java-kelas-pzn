package Standard;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
              10, 35, 24, 99, 48, 59, 67, 28, 19, 61
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 67));
    }
}
