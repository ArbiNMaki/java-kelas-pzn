package OOP;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Kalista");
        employee.sayHello("Arbi");

        employee = new Manager("Kalista");
        employee.sayHello("Arbi");

        employee = new ViceManager("Kalista");
        employee.sayHello("Arbi");

        sayHello(new Employee("Arbi"));
        sayHello(new Manager("Kalista"));
        sayHello(new ViceManager("Katsuki"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hai " + employee.name);
    }
}
