package OOP;

class Person {
    String name;
    String address;
    final String country = "INDONESIA";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
        System.out.println("I Live in " + country);
        System.out.println("My home address is at " + this.address);
    }
}
