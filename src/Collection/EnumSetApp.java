package Collection;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE, PLANT
    }

    public static void main(String[] args) {
        // ALL
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        for(var gender : genders) {
            System.out.println(gender);
        }

        System.out.println("==========");

        // ONE ON ONE
        EnumSet<Gender> kelamin = EnumSet.of(Gender.MALE);
        for(var jeniskelamin : kelamin) {
            System.out.println(jeniskelamin);
        }
    }
}
