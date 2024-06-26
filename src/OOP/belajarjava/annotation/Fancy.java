package OOP.belajarjava.annotation;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})

public @interface Fancy {
    String name();
    String[] tags() default {};
}
