package OOP.belajarjava.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses class App");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
