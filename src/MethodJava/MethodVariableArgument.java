package MethodJava;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {
                75, 77, 87, 95, 100
        };
        sayCongrats("Arbi", values);
        sayCongrat("Budi", 90, 75, 26, 65, 70);
    }

    // Tanpa Variable Argument
   static void sayCongrats(String name, int[] values) {
       var total = 0;
       for(var value : values) {
           total += value;
       }
       int finalValue = total / values.length;

       if(finalValue >= 70) {
           System.out.println("Selamat " + name + ", Anda lulus.");
       } else {
           System.out.println("Maaf " + name + ", Anda tidak lulus.");
       }
   }


    // Dengan Variable Argument
    static void sayCongrat(String name, int... values) {
        var total = 0;
        for(var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if(finalValue >= 70) {
            System.out.println("Selamat " + name + ", Anda lulus.");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus.");
        }
    }
}
