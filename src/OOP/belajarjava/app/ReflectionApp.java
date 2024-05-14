package OOP.belajarjava.app;

import OOP.belajarjava.data.CreateUserRequest;
import OOP.belajarjava.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();

        request.setUsername("Arbi");
        request.setPassword("secret");

        ValidationUtil.validationReflection(request);
    }
}
