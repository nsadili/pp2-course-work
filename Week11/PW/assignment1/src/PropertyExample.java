import java.awt.Point;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

interface SpecificProperty<T> {
    boolean hasProperty(T t);
}

public class PropertyExample {
    public static void main(String[] args) {

        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;

        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;

        SpecificProperty<String> isPanagram = s -> s.chars().filter(Character::isAlphabetic)
                .map(Character::toLowerCase).distinct().count() == 26;

        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;

        System.out.println(isOdd.hasProperty(5));
        System.out.println(isOdd.hasProperty(6));

        Point p1 = new Point(2, 3);
        System.out.println(isInFirstQuadrant.hasProperty(p1));

        String pangram = "Mr. Jock, TV quiz PhD., bags few lynx.";
        System.out.println(isPanagram.hasProperty(pangram));

        Person person = new Person("Ramazan", "Mehdiyev", 20);
        System.out.println(isOlderThan20.hasProperty(person));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> odds = filter(numbers, isOdd);
        System.out.println(odds);

        List<Point> points = List.of(new Point(1, 2), new Point(-3, 4), new Point(5, -6), new Point(-7, -8));
        List<Point> inFirstQuadrant = filter(points, isInFirstQuadrant);
        System.out.println(inFirstQuadrant);

        List<String> strings = List.of("Mr. Jock, TV quiz PhD., bags few lynx.", "Shiny day",
                "abcdefghijklmnopqrstuvwxyz");
        List<String> panagrams = filter(strings, isPanagram);
        System.out.println(panagrams);

        List<Person> people = List.of(
                new Person("Ramazan", "Mehdiyev", 20),
                new Person("Bob", "Marley", 19),
                new Person("Charlie", "Chaplin", 25));
        List<Person> olderThan20 = filter(people, isOlderThan20);
        System.out.println(olderThan20);
    }

    static <T> List<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::hasProperty).collect(Collectors.toList());
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

    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}