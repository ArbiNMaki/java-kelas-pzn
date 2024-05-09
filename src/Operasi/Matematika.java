package Operasi;

public class Matematika {
    public static void main(String[] args) {
        // Operasi Operasi.Matematika
        /*
        (+, -, *, /, %,)
        */

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // Augmented Assignments
        /*
        * a = a + 10 => a += 10
        * a = a - 10 => a -= 10
        * a = a * 10 => a *= 10
        * a = a / 10 => a /= 10
        * a = a % 10 => a %= 10
        * */

        int c = 200;

        c += 20;
        System.out.println(c);

        c -= 20;
        System.out.println(c);

        c *= 20;
        System.out.println(c);


        // Unary Operator
        /*
        * ++ = (a = a + 1)
        * -- = (a = a - 1)
        * - = Negative
        * + = Positive
        * ! = Boolean kebalikan
        */

        int d = +100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);
    }
}
