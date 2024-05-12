package OOP.belajarjava.data;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Drive Avanza");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
