import java.awt.Point;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface SpecificProperty<T> {
    boolean test(T t);

    static SpecificProperty<Integer> isOdd() {
        return n -> n % 2 == 1;
    }

    static SpecificProperty<Point> isInFirstQuadrant() {
        return p -> p.getX() > 0 && p.getY() > 0;
    }

    static SpecificProperty<String> isPangram() {
        return s -> s.chars().filter(Character::isAlphabetic).distinct().count() == 26;
    }

    static SpecificProperty<Person> isOlderThan(int age) {
        return person -> person.getAge() > age;
    }

    static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::test).collect(Collectors.toList());
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
