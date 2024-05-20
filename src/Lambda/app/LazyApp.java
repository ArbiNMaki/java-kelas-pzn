package Lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
//        testScore(76, () -> getName());
//        testScore(74, LazyApp::getName); // getName() tidak dipanggil.
        testScore(76, LazyApp::getName);
    }

    public static void testScore(int value, Supplier<String> name) {
        if(value > 75) {
            System.out.println("Selamat " + name.get() + " , Anda lulus.");
        } else {
            System.out.println("Coba lagi tahun depan.");
        }
    }

    public static String getName() {
        System.out.println("getName() dipanggil.");
        return "Arbi";
    }
}
