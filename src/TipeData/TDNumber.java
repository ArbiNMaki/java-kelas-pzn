package TipeData;

public class TDNumber {
    public static void main(String[] args) {
        // Integer Number
        // Byte = Min:-128, Max:127, Size: 1 byte, default: 0
        // Short = Min:-32.768, Max: 32.767, Size: 2 bytes, default: 0
        // int = Min: -2.147.483.648, Max: 2.147.483.647, Size: 4 bytes, default: 0
        // long = Min: -9.223.372.036.854.775.808, Max: 9.223.372.036.854.775.807, Size: 8 bytes, default: 0
        // Example
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;


        // Floating Number
        // Float = Min: 3.4-038, Max: 3.4e+038, Size: 4 bytes, default: 0.0
        // double = Min: 1.7e-308, Max: 1.7e+308, Size: 8 bytes, default: 0.0
        // Example
        float iniFloat = 10.12F;
        double iniDouble = 12.2424;


        // Literals Number
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;


        // Underscore Number
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;


        // Konversi Tipe Data Number
        // Widening Casting(Otomatis): byte->short->int->long->float->double
        // Narrowing Casting(Manual): double->float->long->int->char->short->byte
        // Example
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;
        long thisLong = thisInt;
        float thisFloat = thisLong;
        double thisDouble = thisFloat;

        float thisFloat2 = (float) thisDouble;
        long thisLong2 = (long) thisFloat2;
        int thisInt2 = (int) thisLong2;
        short thisShort2 = (short) thisInt2;
    }
}
