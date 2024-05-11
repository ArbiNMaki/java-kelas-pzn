package OOP;

class Parent {
    String name;

    void doIt() {
        System.out.println("Do it from parent.");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do it from child.");
        System.out.println("Parent name is " + super.name);
    }
}