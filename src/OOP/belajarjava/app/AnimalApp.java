package OOP.belajarjava.app;

import OOP.belajarjava.data.Animal;
import OOP.belajarjava.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
