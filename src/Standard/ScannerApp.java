package Standard;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur : ");
        int umur = scanner.nextInt();

        System.out.println("Hai " + nama + ", " + "Umur kamu " + umur + " Tahun");
    }
}
