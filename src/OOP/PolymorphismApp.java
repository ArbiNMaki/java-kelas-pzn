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
        if(employee instanceof ViceManager) {
            ViceManager viceManager = (ViceManager) employee;
            System.out.println("Hello VM " + viceManager.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
