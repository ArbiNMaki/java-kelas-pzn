package Standard;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
       try {
           Properties properties = new Properties();
           properties.load(new FileInputStream("application.properties"));

           String fullname = properties.getProperty("name.fullname");
           String country = properties.getProperty("address.country");
           String city = properties.getProperty("address.city");
           String host = properties.getProperty("database.host");
           String port = properties.getProperty("database.port");
           String username = properties.getProperty("database.username");
           String password = properties.getProperty("database.password");

           System.out.println(fullname);
           System.out.println(country);
           System.out.println(city);
           System.out.println(host);
           System.out.println(port);
           System.out.println(username);
           System.out.println(password);

       } catch(FileNotFoundException exception) {
           System.out.println("File tidak ditemukan!");
       } catch(IOException exception) {
           System.out.println("Gagal load data dari file!");
       }

        try {
            Properties properties = new Properties();

            properties.put("hobby", "Coding");
            properties.store(new FileOutputStream("application.properties"), "Komentar");

        } catch(FileNotFoundException exception) {
            System.out.println("Gagal membuat file!");
        } catch(IOException exception) {
            System.out.println("Gagal Menyimpan Properties!");
        }
    }
}
