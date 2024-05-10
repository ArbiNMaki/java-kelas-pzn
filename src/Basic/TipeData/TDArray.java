package Basic.TipeData;

public class TDArray {
    public static void main(String[] args) {
        // Operasi di Array
        // array[index] => mengambil data di array
        // array[index] = value => mengubah data di array
        // array.length => mengambil panjang array

        String[] arrayString = new String[3];
        arrayString[0] = "Arbi";
        arrayString[1] = "Dwi";
        arrayString[2] = "Wijaya";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Wijaya";
        System.out.println(arrayString[0]);


        // Array Initializer
        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50
        };

        long[] arrayLong = {
                20, 40, 60, 80, 100
        };

        String[] stringName = {
                "Arbi", "Dwi", "Wijaya"
        };


        // Ubah data di array
        long[] arrayLong2 = {
                35, 55, 75, 95, 105
        };

        arrayLong2[3] = 25;

        System.out.println(arrayLong2[3]);
        System.out.println(arrayLong2.length);


        // Memasukkan data kosong di array
        stringName[0] = null;


        // Array di dalam Array
        String[][] members = {
                {"Arbi", "Dwi", "Wijaya"},
                {"Wijaya", "Dwi", "Arbi"},
                {"Dwi", "Wijaya", "Arbi"}
        };

        String[] member1 = members[0];

//        System.out.println(member1[0]);
        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[0][2]);

        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
        System.out.println(members[1][2]);

        System.out.println(members[2][0]);
        System.out.println(members[2][1]);
        System.out.println(members[2][2]);
    }
}
