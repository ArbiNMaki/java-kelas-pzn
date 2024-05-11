package OOP;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Arbi";
        manager.sayHello("Katsuki");

        var viceManager = new ViceManager();
        viceManager.name = "Maki";
        viceManager.sayHello("Katsuki");
    }
}
