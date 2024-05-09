public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Representasi Tipe Data Primitif (1)
        // Primitif -> Bukan Primitif
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        //Example
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;
        Short iniShort; // null
        iniShort = 100;

        // Konversi dari Tipe Primitif
        int age = 27;
        Integer ageObject = age;
        int ageAgain = ageObject;
        Integer ageInt = ageAgain;

        short thisShort = ageInt.shortValue();
        long thisLong = ageInt.longValue();
    }
}
