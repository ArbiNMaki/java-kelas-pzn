package Basic.Operasi;

public class Boolean {
    public static void main(String[] args) {
        // Operasi Boolean
        /*
        * && Dan
        * || Atau
        * ! Kebalikan
        */

        // Operasi &&
        /*
        * true && true   = true
        * true && false  = false
        * false && true  = false
        * false && false = false
        */

        // Operasi ||
        /*
        * true || true   = true
        * true || false  = true
        * false || true  = true
        * false || false = false
        */

        // Operasi !
        /*
        * !true  = false
        * !false = true
        */

        int[] absen = {
                70, 80
        };

        int[] nilaiAkhir = {
                80, 90
        };

        var lulusAbsen = absen[0] >= 75;
        var lulusNilaiAkhir = nilaiAkhir[0] >= 75;
        var lulus = lulusAbsen && lulusNilaiAkhir;

        var lulusAbsen2 = absen[1] >= 75;
        var lulusNilaiAkhir2 = nilaiAkhir[1] >= 75;

        var lulus2 = lulusAbsen2 && lulusNilaiAkhir2;

        System.out.println(lulus);
        System.out.println(lulus2);
    }
}
