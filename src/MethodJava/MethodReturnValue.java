package MethodJava;

public class MethodReturnValue {
    public static void main(String[] args) {

        var result = sum(100, 200);

        System.out.println(result);

        System.out.println(hitung(1000, 750, "+"));
        System.out.println(hitung(1000, 750, "-"));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value3, int value4, String operasi) {
        return switch (operasi) {
            case "+" -> value3 + value4;
            case "-" -> value3 - value4;
            default -> 0;
        };
    }
}
