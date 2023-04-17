package Week11.pw2;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import Week10.ex4.SpecificProperty;

public class SpecificPropertyDemo {
    public static void main(String[] args) {
        // if odd
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        //if point is in the first quadrant
        SpecificProperty<Point> isInFirstQuadrant = p -> p.getx() > 0 && p.gety() > 0;
        // if string is Panagram
        SpecificProperty<String> isPanagram = s -> s.chars()
                .filter(Character::isAlphabetic).map(Character::toLowerCase).distinct().count() == 26;
        // if the Person is older than 20
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;

        System.out.println(isOdd.test(3)); 
        System.out.println(isInFirstQuadrant.test(new Point(2, 3))); 
        System.out.println(isPanagram.test("The quick brown fox jumps over the lazy dog")); 
        System.out.println(isOlderThan20.test(new Person("Leyla", "Neymat", 18)));

        List<String> words = List.of("apple", "banana", "cherry", "orage", "berry");
        Collection<String> result = filter(words, s -> s.startsWith("b"));
        System.out.println(result); 
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::test).collect(Collectors.toList());
    }
}
