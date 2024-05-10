package Basic.Percabangan;

public class PercabanganIF {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 75;

        if(nilai >= 65 && absen >= 70) {
            System.out.println("Anda Lulus.");
        } else {
            System.out.println("Anda Tidak Lulus");
        }

        if(nilai >= 90 && absen >= 90) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
