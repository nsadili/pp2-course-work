import java.awt.Point;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface SpecificProperty<T> {
    boolean test(T t);
}

class Main {
    public static void main(String[] args) {
        // Lambda expressions to implement SpecificProperty interface
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = p -> p.x > 0 && p.y > 0;
        SpecificProperty<String> isPangram = s -> s.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;
        SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;
        
        // Create some test data
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(-1, 1), new Point(1, -1), new Point(-1, -1));
        List<String> strings = Arrays.asList("The quick brown fox jumps over the lazy dog", "Hello World", "Pack my box with five dozen liquor jugs", "The quick brown fox jumps over the lazy dog.");
        List<Person> people = Arrays.asList(new Person("John", "Doe", 25), new Person("Jane", "Doe", 18), new Person("Bob", "Smith", 35));

        // Test the lambda expressions with the test data
        List<Integer> oddNumbers = filter(nums, isOdd);
        List<Point> pointsInFirstQuadrant = filter(points, isInFirstQuadrant);
        List<String> pangrams = filter(strings, isPangram);
        List<Person> olderThan20 = filter(people, isOlderThan20);

        // Print the results
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Points in the first quadrant: " + pointsInFirstQuadrant);
        System.out.println("Pangrams: " + pangrams);
        System.out.println("People older than 20: " + olderThan20);
    }

    public static <T> List<T> filter(Collection<T> collection, SpecificProperty<T> p) {
        return collection.stream().filter(p::test).collect(Collectors.toList());
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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}
