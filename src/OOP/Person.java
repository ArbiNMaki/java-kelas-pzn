package OOP;

class Person {
    String name;
    String address;
    final String country = "INDONESIA";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
        System.out.println("I Live in " + country);
        System.out.println("My home address is at " + address);
    }
}
