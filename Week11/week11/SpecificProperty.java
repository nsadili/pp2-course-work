package week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class SpecificProperty {

    public static Predicate<Integer> isOdd = num -> num % 2 != 0;
    public static Predicate<Point> isFirstQuadrant = point -> point.getX() > 0 && point.getY() > 0;
    public static Predicate<String> isPangram = str -> str.toLowerCase().chars().filter(Character::isLetter)
            .distinct().count() == 26;
    public static Predicate<Person> isOlderThan20 = person -> person.getAge() > 20;
    public static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {
        Collection<T> result = new ArrayList<>();
        for (T element : c) {
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    static class Point {
        private int x;
        private int y;

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

    
    static class Person {
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

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collection<Integer> oddNumbers = filter(numbers, isOdd);
        System.out.println("Odds: " + oddNumbers);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(-3, 4);
        Point p3 = new Point(0, -1);

        Collection<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);

        Collection<Point> pointsInFirstQuadrant = filter(points, isFirstQuadrant);
        System.out.println(" first quadrant: " + pointsInFirstQuadrant);

        String str1 = "salam";
        String str2 = "Hello ";
        String str3 = "alma armud";

        Collection<String> strings = new ArrayList<>();
        strings.add(str1);
        strings.add(str2);
        strings.add(str3);

        Collection<String> pangrams = filter(strings, isPangram);
        System.out.println("Pangrams: " + pangrams);

        Person person1 = new Person("ismayil", "ismayilov", 25);
        Person person2 = new Person("emin", "sadiqov", 34);
    }
}
