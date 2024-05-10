package MethodJava;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Arbi", "Dwi", "Wijaya");
        bilangHalo("Bakugo", "Katsuki");
    }

    static void sayHello(String firstName, String middleName, String lastName) {
        System.out.println("Hello " + firstName + " " + middleName + " " + lastName);
    }

    static void bilangHalo(String namaPertama, String namaTerakhir) {
        System.out.println("Halo " + namaPertama + " " + namaTerakhir);
    }
}
