package OOP;

class Manager {
    String name;

    Manager(String name) {
        this.name = name;
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