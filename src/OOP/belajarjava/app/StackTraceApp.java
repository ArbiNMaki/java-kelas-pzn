package OOP.belajarjava.app;

public class StackTraceApp {
    public static void main(String[] args) {
//        try {
//            String[] names = {
//                    "Arbi", "Dwi", "Wijaya"
//            };
//            System.out.println(names[5]);
//        } catch(Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        } catch(RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] nama = {
                    "Wijaya", "Dwi", "Arbi"
            };
            System.out.println(nama[7]);
        } catch(Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
