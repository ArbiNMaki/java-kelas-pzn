package Lambda.app;

import Lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // without Method Reference
        Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        System.out.println(predicate.test("Arbi"));
        System.out.println(predicate.test("arbi"));

        // With Method Reference
        Predicate<String> predicateMR = StringUtil::isLowerCase;
        System.out.println(predicateMR.test("Katsuki"));
        System.out.println(predicateMR.test("katsuki"));

        // Method Reference di Parameter
        Function<String, String> function = String::toUpperCase;

        System.out.println(function.apply("Arbi"));
        System.out.println(function.apply("Katsuki"));
    }

    public void run() {
        Predicate<String> predicate = this::isLowerCase;
        System.out.println(predicate.test("Arbi"));
        System.out.println(predicate.test("arbi"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicate = app::isLowerCase;

        System.out.println(predicate.test("Arbi"));
        System.out.println(predicate.test("arbi"));
    }

    public boolean isLowerCase(String value) {
        for(var c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
