package Basic.MethodJava;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println("===== Factorial Biasa =====");
        System.out.println(factorial(9));

        System.out.println("===== Factorial Recursive =====");
        System.out.println(factorialRecursive(6));
    }

    // Factorial Loop
    static int factorial(int value) {
        var result = 1;
        for(int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }


    // Factorial Recursive
    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive((value -1));
        }
    }
}
