package Basic.Variable;

public class namaVariable {
    public static void main(String[] args) {
        String name = "Arbi Dwi Wijaya";
        int age = 27;
        String address = "Malang, Jawa Timur, Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Bakugou Katsuki";
        System.out.println(name);


        // Kata kunci var
        var nama = "Arbi Dwi Wijaya";
        var umur = 27;
        var alamat = "Malang, Jawa Timur, Indonesia";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);


        // Kata kunci final
        final String namae = "Arubi Duwi Wijaya";
//        namae = "Arbi"; // Error
    }
}
