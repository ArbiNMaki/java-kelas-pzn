package OOP;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person("Arbi", "Malang");
//        person.name = "Arbi Dwi Wijaya";
//        person.address = "Malang";
//        person.country = "Tidak Bisa Diubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Katsuki");

        var person1 = new Person("Maki", "Tokyo");
        var person2 = new Person("Maki");
        var person3 = new Person();

    }
}
