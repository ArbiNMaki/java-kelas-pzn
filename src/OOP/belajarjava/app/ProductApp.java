package OOP.belajarjava.app;

import OOP.belajarjava.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac", 10_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

//        product.name = "Indomie"; // Bisa diakses karena di package sama
//        product.price = 3500; // Bisa diakses karena di package sama
//
//        System.out.println(product.getName());
//        System.out.println(product.getPrice());

        System.out.println(product);

        Product product2 = new Product("Mac", 10_000_000);
        System.out.println(product.equals(product2));

        System.out.println(product.hashCode() == product2.hashCode());
    }
}
