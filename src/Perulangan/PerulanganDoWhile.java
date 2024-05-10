package Perulangan;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        // Syntax Do-While Loop
        /*
            do {
                // Block Perulangan
            } while (condition;)
        */

        var counter = 1;

        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 20);
    }
}
