import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    interface SpecificProperty<T> {
        boolean test(T t);
    }

    static class Utility {
        public static <T> int count(List<Integer> numbers, Main.SpecificProperty<Integer> isOdd) {
            int count = 0;
            for (Integer t : numbers) {
                if (isOdd.test(t)) {
                    count++;
                }
            }
            return count;
        }
        
        public static <T> List<T> filter(Collection<T> c, SpecificProperty<T> p) {
            List<T> filteredList = new ArrayList<>();
            for (T t : c) {
                if (p.test(t)) {
                    filteredList.add(t);
                }
            }
            return filteredList;
        }
    }

    public static void main(String[] args) {
        
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;
        SpecificProperty<String> isPanagram = s -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;

        //testing

        List<Integer> numbers = List.of(1, 2, 3, 4);
        int oddCount = Utility.count(numbers, isOdd);
        System.out.println("Number of odd numbers: " + oddCount);

        List<Point> points = List.of(new Point(1, 1), new Point(2, 2), new Point(-1, -1));
        List<Point> firstQuadrantPoints = Utility.filter(points, isInFirstQuadrant);
        System.out.println("Points in the first quadrant: " + firstQuadrantPoints);

        List<String> strings = List.of("The quick brown fox jumps over the lazy dog", "Hello world", "Pack my box with five dozen liquor jugs");
        List<String> panagrams = Utility.filter(strings, isPanagram);
        System.out.println("Panagrams: " + panagrams);

        List<Person> people = List.of(new Person("Aysel", "Panahova", 18), new Person("Nahid", "Aliyev", 28), new Person("Fidan", "Quliyeva", 20));
        List<Person> olderThan20 = Utility.filter(people, isOlderThan20);
        System.out.println("People older than 20: " + olderThan20);
    }
}

class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
