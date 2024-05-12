package OOP.belajarjava.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Drive Bus.");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "SUBARU";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
