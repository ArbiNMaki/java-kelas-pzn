package Generic.application;

import Generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Arbi", "Dwi", "Wijaya"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
