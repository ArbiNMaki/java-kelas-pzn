package Basic.Perulangan;

public class PerulanganWhile {
    public static void main(String[] args) {
        // Syntax While Loop
        /*
            while (condition;) {
                // Block perulangan
            }
        */

        var counter = 1;

        while (counter <= 20) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
    }
}
