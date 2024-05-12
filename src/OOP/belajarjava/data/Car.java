package OOP.belajarjava.data;

public interface Car extends HasBrand, isMaintenance {
    void drive();
    int getTire();

    default boolean isBig() {
        return false;
    }
}
