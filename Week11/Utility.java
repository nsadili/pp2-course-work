import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Point {
    private int x, y;

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

interface SpecificProperty<T> {
    boolean test(T t);
}

public class Utility {

    public static <T> int count(Collection<T> c, Predicate<T> p) {
        int count = 0;
        for (T t : c) {
            if (p.test(t)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> filteredList = new ArrayList<>();
        for (T t : c) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        // i. Check if the integer is odd
        SpecificProperty<Integer> isOdd = x -> x % 2 != 0;

        // ii. Check if the point is in the first quadrant
        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;

        // iii. Check if the given string is Panagram
        SpecificProperty<String> isPanagram = s -> s.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26;

        // iv. Check if the given Person is older than 20
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;

        // Sample collections for testing
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Point> points = List.of(new Point(1, 1), new Point(2, 2), new Point(-1, 1), new Point(1, -1), new Point(-1, -1));
        List<String> strings = List.of("The quick brown fox jumps over the lazy dog", "Pack my box with five dozen liquor jugs", "This is not a panagram");
        List<Person> people = List.of(new Person("John", "Doe", 18), new Person("Jane", "Doe", 25), new Person("Bob", "Smith", 30), new Person("Alice", "Jones", 20));

        // Testing count method with Predicate
        int oddCount = count(numbers, x -> x % 2 != 0);
        System.out.println("Number of odd numbers: " + oddCount);

        // Testing filter method with SpecificProperty
        List<Point> firstQuadrantPoints = filter(points, p -> p.getX() > 0 && p.getY() > 0);
        System.out.println("Points in the first quadrant: " + firstQuadrantPoints);

        List<String> panagrams = filter(strings, s -> s.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26);
        System.out.println("Panagrams: " + panagrams);
    
        List<Person> olderThan20 = filter(people, p -> p.getAge() > 20);
        System.out.println("People older than 20: " + olderThan20);
    }
}
