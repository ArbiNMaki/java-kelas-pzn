package OOP.belajarjava.app;

import OOP.belajarjava.data.Avanza;
import OOP.belajarjava.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
