package OOP.belajarjava.app;

import OOP.belajarjava.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Iphone", 20_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
