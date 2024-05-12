package OOP.belajarjava.data;

// Public Class
public class Product {
    public String name;
    public int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name:" + name + ", price:" + price;
    }
}
