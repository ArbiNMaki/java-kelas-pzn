package OOP.belajarjava.app;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Arbi";
        first = first + " " + "Dwi" + " " + "Wijaya";

        String second = "Arbi Dwi Wijaya";

        System.out.println(first == second); // False
        System.out.println(first.equals(second)); // True
    }
}
