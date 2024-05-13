package OOP.belajarjava.app;

import OOP.belajarjava.error.BlankException;
import OOP.belajarjava.error.ValidationException;
import OOP.belajarjava.records.LoginRequest;
import OOP.belajarjava.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        // Exception
//        LoginRequest loginRequest = new LoginRequest(null, null);
//        LoginRequest loginRequest = new LoginRequest("arbi", null);
        LoginRequest loginRequest = new LoginRequest("arbi", "rahasia");

        // TryCatch 1
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid.");
//        } catch (ValidationException e) {
//            System.out.println("Terjadi Error : " + e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("Terjadi Error Null : " + e.getMessage());
//        }

        // TryCatch 2
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid.");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error : " + e.getMessage());
        } finally {
            System.out.println("Error gak error, tetap di panggil.");
        }

        System.out.println("=========");

        // Runtime Exception
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Valid.");
    }
}
