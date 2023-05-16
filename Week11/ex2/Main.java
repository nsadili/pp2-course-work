package ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Utility {
    public static <T> int count(Collection<T> c, Predicate<T> p) {
        int count = 0;
        for (T item : c) {
            if (p.test(item)) {
                count++;
            }
        }
        return count;
    }
    
    public static <T> List<T> filter(Collection<T> c, Predicate<T> p) {
        List<T> filteredList = new ArrayList<>();
        for (T item : c) {
            if (p.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
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

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Person> persons = List.of(
                new Person("John", "Doe", 25),
                new Person("Jane", "Smith", 18),
                new Person("Bob", "Johnson", 30)
        );

        // Check if the integer is odd
        Predicate<Integer> isOdd = num -> num % 2 != 0;

        // Check if the point is in the first quadrant
        Predicate<Point> isFirstQuadrant = point -> point.getX() > 0 && point.getY() > 0;

        // Check if the given string is a Pangram
        Predicate<String> isPangram = str -> str.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;

        // Check if the given Person is older than 20
        Predicate<Person> isOlderThan20 = person -> person.getAge() > 20;

        // Example usage of count method
        int oddCount = Utility.count(numbers, isOdd);
        System.out.println("Count of odd numbers: " + oddCount);

        // Example usage of filter method
        List<Person> filteredPersons = Utility.filter(persons, isOlderThan20);
        System.out.println("Persons older than 20: " + filteredPersons);
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

