package OOP.belajarjava.app;

import OOP.belajarjava.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null); // Akan di reject
//        category.id = null;

        System.out.println(category.getId());
    }
}
