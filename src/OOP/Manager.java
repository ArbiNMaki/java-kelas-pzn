package OOP;

class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is Manager " + this.name);
    }
}

class ViceManager extends  Manager {
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VM " + this.name);
    }
}