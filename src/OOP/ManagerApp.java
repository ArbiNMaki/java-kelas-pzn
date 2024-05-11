package OOP;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Arbi");
//        manager.name = "Arbi";
        manager.sayHello("Katsuki");

        var viceManager = new ViceManager("Maki");
//        viceManager.name = "Maki";
        viceManager.sayHello("Katsuki");
    }
}
