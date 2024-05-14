package Standard;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String stringNumber = "10";

        Integer intNumber = Integer.valueOf(stringNumber);
        System.out.println(intNumber);
    }
}
