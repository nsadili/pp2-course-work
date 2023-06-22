package Week11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpecificProperty {
    public static void main(String[] args) {
        // isOdd
        SpecificPropertyInterface<Integer> isOdd = parameter -> parameter % 2 != 0;
        System.out.println("2 is odd: " + isOdd.apply(2));
        System.out.println("3 is odd: " + isOdd.apply(3));

        System.out.println();
        // isInFirstQuadrant
        SpecificPropertyInterface<Point> isInFirstQuadrant = parameter -> parameter.getX() > 0 && parameter.getY() > 0;
        System.out.println("(1, 1) is in the first quadrant: " + isInFirstQuadrant.apply(new Point(1, 1)));
        System.out.println("(-1, -5) is in the first quadrant: " + isInFirstQuadrant.apply(new Point(-1, -5)));

        System.out.println();
        // isPanagram
        SpecificPropertyInterface<String> isPanagram = parameter -> {
            parameter = parameter.toLowerCase();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (parameter.indexOf(ch) == -1)
                    return false;
            }
            return true;
        };
        System.out.println("(Hello world) is Panagram: " + isPanagram.apply("Hello World"));
        System.out.println("(abcdefghijklmnopqrstuvwxyz) is Panagram: " + isPanagram.apply("abcdefghijklmnopqrstuvwxyz"));

        System.out.println();
        //isOlderThan20
        SpecificPropertyInterface<Person> isOlderThan20 = parameter -> parameter.getAge() > 20;
        Person John = new Person("John Smith", 21);
        System.out.println(John.toString());
        System.out.println("John is older than 20: " + isOlderThan20.apply(John));

        System.out.println();
        // filter Method
        System.out.println(filter(new ArrayList<>(List.of(1, 2, 3, 4)), parameter -> parameter % 2 == 0));
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificPropertyInterface<T> p) {
        Collection<T> filtered = new ArrayList<>();
        for (T element: c) {
            if (p.apply(element))
                filtered.add(element);
        }
        return filtered;
    }
}

interface SpecificPropertyInterface <T> {
    boolean apply(T parameter);
}