package Standard;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 25; i++) {
            var value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
