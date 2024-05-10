package Perulangan;

public class ForEach {
    public static void main(String[] args) {
        // Tanpa For-Each

        System.out.println("===== Tanpa For-Each =====");

        String[] larik = {
                "Arbi", "Dwi", "Wijaya",
                "Kota", "Malang"
        };

        for (int i = 0; i < larik.length; i++) {
            System.out.println(larik[i]);
        }

        System.out.println("===== For-Each =====");

        // For-Each
        for (var value: larik) {
            System.out.println(value);
        }

    }
}
