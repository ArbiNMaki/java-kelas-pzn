package Collection;

import Collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Arbi");

        person.addHobby("Gaming");
        person.addHobby("Watching Anime");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan hobi");
    }
}
