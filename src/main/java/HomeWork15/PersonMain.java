package HomeWork15;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Hanna", 18),
                new Person("Liza", 25),
                new Person("Gleb", 24),
                new Person("Zoya", 24),
                new Person("Anna", 18),
                new Person("Petro", 34)
        };

        Comparator<Person> comparator = Comparator
                .comparing(Person::getAge)
                .thenComparing(Person::getName);

        Arrays.sort(persons, comparator);
        Arrays.asList(persons).forEach(System.out::println);
    }
}
