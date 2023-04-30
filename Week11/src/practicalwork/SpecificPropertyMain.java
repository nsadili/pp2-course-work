package practicalwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SpecificPropertyMain {
	
    public static void main(String[] args) {
    	
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumbers = (List<Integer>) filter(numbers, (n) -> n % 2 != 0);
        System.out.println("odd numbers" + oddNumbers);

        List<Point> points = Arrays.asList(new Point(1, 2), new Point(0, 1), new Point(-2, -3), new Point(3, 4));
        List<Point> pointsInFirstQuadrant = (List<Point>) filter(points, (p) -> p.x > 0 && p.y > 0);
        System.out.println("points in first quad. " + pointsInFirstQuadrant);

        List<String> strings = Arrays.asList("car run over the  dog", "Hello World", "Give this code to me");
        List<String> panagram = (List<String>) filter(strings, (s) -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26);
        System.out.println("panagram " + panagram);

        List<Person> people = Arrays.asList(new Person("Huseyn", "Sadatkhanov", 25), new Person("Zakir", "Ashirli", 19), new Person("Ali", "Nasirli", 30));
        List<Person> olderThan20 = (List<Person>) filter(people, (p) -> p.getAge() > 20);
        System.out.println("people older than 20 " + olderThan20);
    }
    public interface SpecificProperty<T> {
        boolean check(T item);
    }
    public static <T> Collection<T> filter(Collection<T> collection, SpecificProperty<T> property) {
        List<T> result = new ArrayList<>();
        for (T item : collection) {
            if (property.check(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static class Person {
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
        @Override
        public String toString() {
            return firstName + " " + lastName + " (" + age + ")";
        }
    }
}