package OOP.belajarjava.app;

import OOP.belajarjava.records.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Arbi", "secret");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Arbi"));
        System.out.println(new LoginRequest("Arbi", "secret"));

    }
}
