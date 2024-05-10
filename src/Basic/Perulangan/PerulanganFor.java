package Basic.Perulangan;

public class PerulanganFor {
    public static void main(String[] args) {
        // Syntax For Loop
        /*
            for(init statement; condition; post statement) {
                // Block perulangan
            }
        */

        for(var counter = 1; counter <= 20; counter++) {
            System.out.println("Looping ke-" + counter);
        }
    }
}
