package OOP.belajarjava.app;

import OOP.belajarjava.data.City;
//import OOP.belajarjava.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); // Error
        var city = new City();
        city.name = "Malang";

        System.out.println(city.name);
    }
}
