package OOP.belajarjava.data;

import java.util.Objects;

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

    // Manual
//    public boolean equals(Object o) {
//        if(this == o) return true;
//        if(!(o instanceof Product)) return false;
//
//        Product product = (Product) o;
//
//        if(price != product.price) return false;
//        return name != null ? name.equals(product.name) : product.name == null;
//    }


    // Hasil Generate
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }
}
