import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface SpecificProperty<T> {
    boolean test(T t);
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collection<Integer> oddNumbers = filter(numbers, isOdd());
        System.out.println("Odd numbers: " + oddNumbers);

        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 2));
        points.add(new Point(-1, -2));
        points.add(new Point(3, 4));
        Collection<Point> pointsInFirstQuadrant = filter(points, isInFirstQuadrant());
        System.out.println("Points in first quadrant: " + pointsInFirstQuadrant);

        List<String> strings = List.of("The quick brown fox jumps over the lazy dog", "Hello world",
                "Testing Panagram");
        Collection<String> panagrams = filter(strings, isPanagram());
        System.out.println("Panagrams: " + panagrams);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Azer", "Azerov", 25));
        persons.add(new Person("Babak", "Babakov", 27));
        persons.add(new Person("Samir", "Samirov", 28));
        Collection<Person> personsOver20 = filter(persons, isOver20());
        System.out.println("Persons over 20: " + personsOver20);
    }

    static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : c) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    static SpecificProperty<Integer> isOdd() {
        return n -> n % 2 != 0;
    }

    static SpecificProperty<Point> isInFirstQuadrant() {
        return p -> p.getX() > 0 && p.getY() > 0;
    }

    static SpecificProperty<String> isPanagram() {
        return s -> s.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count() == 26;
    }

    static SpecificProperty<Person> isOver20() {
        return person -> person.getAge() > 20;
    }
}

class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
