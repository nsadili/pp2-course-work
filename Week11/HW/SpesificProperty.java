package Week11.HW;

import java.util.Collection;
import java.util.stream.Collectors;

import Week05.Person;
import Week06.Point;

public class SpesificProperty {
    interface SpecificProperty<T> {
        boolean test(T t);
    }
    
    SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
    
    SpecificProperty<Point> isInFirstQuadrant = point -> point.getX() > 0 && point.getY() > 0;
 
    SpecificProperty<String> isPangram = s -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;

    SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;

    <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::test).collect(Collectors.toList());
    }
}
