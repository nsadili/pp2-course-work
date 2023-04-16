package pw2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SpecificProperty<Integer> checkOdd = num -> num % 2 != 0;
        SpecificProperty<Point> checkQuadrant = point -> point.getX() > 0 && point.getY() > 0;
        SpecificProperty<Person> checkAge = person -> person.age > 20;
        SpecificProperty<String> checkPanagram = str -> {
            Set<Character> checking = new HashSet<Character>();
            for (Character a : str.toLowerCase().toCharArray()) {
                if (a >= 'a' && a <= 'z')
                    checking.add(a);
            }
            return checking.size() == 26;

        };
        System.out.println("Check odd: " + checkOdd.check(135));
        System.out.println("Check age: " + checkAge.check(new Person("Rahima", "Karimova", 17)));
        System.out.println("Check quadrant: " + checkQuadrant.check(new Point(-3, 6)));
        System.out.println("Check Panagram: "+ checkPanagram.check("The quick brown fox jumps over the lazy dog"));

    }

}
