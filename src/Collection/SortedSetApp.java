package Collection;

import Collection.data.Person;
import Collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // Ascending
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // Descending

        people.add(new Person("Katsuki"));
        people.add(new Person("Arbi"));
        people.add(new Person("Maki"));

        for(var person : people) {
            System.out.println(person.getName());
        }

        // Immutable
        SortedSet<Person> sorted = Collections.unmodifiableSortedSet(people);
        sorted.add(new Person("Malang"));
    }
}
