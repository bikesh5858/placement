package list;


import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Compare by age first
        if (p1.age != p2.age) {
            return p1.age - p2.age;
        }
        // If ages are equal, compare by name
        return p1.name.compareTo(p2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Dave", 30));

        // Sort using the AgeComparator
        Collections.sort(people, new AgeComparator());

        // Print the sorted list
        System.out.println(people);
    }
}
