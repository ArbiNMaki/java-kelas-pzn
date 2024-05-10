package Basic.Perulangan;

public class BreakandContinue {
    public static void main(String[] args) {
        // Break = Untuk menghentikan semua.

        var looping = 1;

        while (true) {
            System.out.println("Perulangan ke-" + looping);
            looping++;

            if(looping > 5) {
                // Break
                break;
            }
        }
        System.out.println("Perulangan Berhenti!.");


        // Continue = Untuk menghentikan sementara lalu melanjutkannya kembali.
        for (int counter = 1; counter <= 100; counter++) {
            if(counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
