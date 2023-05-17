package Week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface SpecificProperty<T> {
    boolean check(T item);
}

class Utility {
    static <T> int count(Collection<T> collection, SpecificProperty<T> property) {
        int count = 0;
        for (T item : collection) {
            if (property.check(item)) {
                count++;
            }
        }
        return count;
    }

    static <T> List<T> filter(Collection<T> collection, SpecificProperty<T> property) {
        List<T> filteredList = new ArrayList<>();
        for (T item : collection) {
            if (property.check(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}

class Main {
    public static void main(String[] args) {
        // Check if the integer is odd
        SpecificProperty<Integer> isOdd = num -> num % 2 != 0;

        // Check if the given Person is older than 20
        SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;

        // Testing count method
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int oddCount = Utility.count(numbers, isOdd);
        System.out.println("Count of odd numbers: " + oddCount);

        // Testing filter method
        List<Person> people = List.of(
                new Person("John", "Doe", 25),
                new Person("Jane", "Smith", 18),
                new Person("Mike", "Johnson", 30)
        );
        List<Person> filteredPeople = Utility.filter(people, isOlderThan20);
        System.out.println("People older than 20:");
        for (Person person : filteredPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
