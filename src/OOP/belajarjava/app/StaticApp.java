package OOP.belajarjava.app;

import OOP.belajarjava.data.Application;
//import OOP.belajarjava.data.Constant;
import OOP.belajarjava.data.Country;
import OOP.belajarjava.util.MathUtil;

// Static Import
import static OOP.belajarjava.data.Constant.*;

public class StaticApp {

    public static void main(String[] args) {
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERSION);

        // Static Import
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(1,2,3,4,5,6,7,8,9,10));

        Country.City city = new Country.City();
        city.setName("Malang");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
