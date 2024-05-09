package Percabangan;

public class PercabanganSwitch {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik!.");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus.");
                break;
            case "D":
                System.out.println("Anda tidak lulus.");
                break;
            default:
                System.out.println("Anda salah jurusan.");
        }


        // Switch Lambda
        var score = "D";

        switch (score) {
            case "A" -> System.out.println("Anda lulus dengan baik!.");
            case "B", "C" -> System.out.println("Anda lulus.");
            case "D" -> System.out.println("Anda tidak lulus.");
            default -> {
                System.out.println("Anda salah jurusan.");
            }
        }


        // Kata kunci yield
        // Manual
        var angka = "E";
        String result;

        switch (angka) {
            case "A" -> result = "Anda lulus dengan baik!.";
            case "B", "C" -> result = "Anda lulus.";
            case "D" -> result = "Anda tidak lulus.";
            default -> result = "Anda salah jurusan.";
        }
        System.out.println(result);

        // Yield keyword
        String hasil = switch (angka) {
            case "A":
                yield "Anda lulus dengan baik!.";
            case "B", "C":
                yield "Anda lulus.";
            case "D":
                yield "Anda tidak lulus.";
            default:
                yield "Anda salah jurusan.";
        };
        System.out.println(hasil);
    }
}
