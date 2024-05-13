package OOP.belajarjava.app;

import OOP.belajarjava.data.Customer;
import OOP.belajarjava.enums.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Arbi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("==== PRINT LEVEL ====");
        for(var value : Level.values()) {
            System.out.println(value);
        }
    }
}
