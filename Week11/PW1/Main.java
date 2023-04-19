import java.awt.Point;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test isOdd
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collection<Integer> oddNumbers = SpecificProperty.filter(numbers, SpecificProperty.isOdd());
        System.out.println("Odd numbers: " + oddNumbers);

        // Test isInFirstQuadrant
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(-1, 1), new Point(1, -1), new Point(-1, -1));
        Collection<Point> firstQuadrantPoints = SpecificProperty.filter(points, SpecificProperty.isInFirstQuadrant());
        System.out.println("Points in the first quadrant: " + firstQuadrantPoints);

        // Test isPangram
        List<String> sentences = Arrays.asList("The quick brown fox jumps over the lazy dog", "This is not a pangram");
        Collection<String> pangrams = SpecificProperty.filter(sentences, SpecificProperty.isPangram());
        System.out.println("Pangrams: " + pangrams);

        // Test isOlderThan
        List<Person> people = Arrays.asList(
                new Person("Ali", "Aliyev", 22),
                new Person("Amal", "Mammadzada", 17),
                new Person("Nihad", "Aslanov", 25)
        );
        Collection<Person> olderThan20 = SpecificProperty.filter(people, SpecificProperty.isOlderThan(20));
        System.out.println("People older than 20: " + olderThan20);
    }
}
