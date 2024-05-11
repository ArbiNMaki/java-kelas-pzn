package OOP;

class Manager extends Employee {
    String company;

    Manager(String name) {
        super(name);
    }
    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is Manager " + this.name);
    }
}

class ViceManager extends  Manager {
    ViceManager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VM " + this.name);
    }
}