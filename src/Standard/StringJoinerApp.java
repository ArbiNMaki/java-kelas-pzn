package Standard;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Arbi", "Dwi", "Wijaya"};
        StringJoiner joiner = new StringJoiner(
                ", ", "[", "]"
        );

        for(var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }
}
