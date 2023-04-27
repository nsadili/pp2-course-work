import java.awt.Point;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface SpecificProperty<T> {
    boolean test(T t);

    static Predicate<Integer> isOdd() {
        return n -> n % 2 != 0;
    }

    static Predicate<Point> isInFirstQuadrant() {
        return p -> p.getX() > 0 && p.getY() > 0;
    }

    static Predicate<String> isPangram() {
        return s -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
    }

    static Predicate<Person> isOlderThan20() {
        return p -> p.getAge() > 20;
    }

    static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::test).collect(Collectors.toList());
    }
}
