package Lambda.util;

import java.util.function.Predicate;

public class StringUtil {
    public static boolean isLowerCase(String value) {
        for(var c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
