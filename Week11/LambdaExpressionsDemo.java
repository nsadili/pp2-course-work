package Week11;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;

interface LambdaExpressionDemo<T> {
    boolean isSatisfiedBy(T item);
}

class Utility {
    public static <T> int count(Collection<T> c, LambdaExpressionDemo<T> p) {
        int count = 0;
        for (T item : c) {
            if (p.isSatisfiedBy(item)) {
                count++;
            }
        }
        return count;
    }

    public static <T> Collection<T> filter(Collection<T> c, LambdaExpressionDemo<T> p) {
        return c.stream().filter(p::isSatisfiedBy).collect(Collectors.toList());
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
public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        // Check if the integer is odd
        LambdaExpressionDemo<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.isSatisfiedBy(5)); // Output: true
        System.out.println(isOdd.isSatisfiedBy(4)); // Output: false

        // Check if the point is in the first quadrant
        LambdaExpressionDemo<Point> isFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, 4);
        System.out.println(isFirstQuadrant.isSatisfiedBy(p1)); // Output: true
        System.out.println(isFirstQuadrant.isSatisfiedBy(p2)); // Output: false

        // Check if the given string is Pangram
        LambdaExpressionDemo<String> isPangram = s -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
        String pangram = "The quick brown fox jumps over the lazy dog";
        String notPangram = "The quick brown fox jumps over the lazy cat";
        System.out.println(isPangram.isSatisfiedBy(pangram)); // Output: true
        System.out.println(isPangram.isSatisfiedBy(notPangram)); // Output: false

        // Check if the given Person ( firstname (String), lastname (String), age (int) ) is older than 20
        LambdaExpressionDemo<Person> isOlderThan20 = p -> p.getAge() > 20;
        Person person1 = new Person("John", "Doe", 25);
        Person person2 = new Person("Jane", "Doe", 18);
        System.out.println(isOlderThan20.isSatisfiedBy(person1)); // Output: true
        System.out.println(isOlderThan20.isSatisfiedBy(person2)); // Output: false

        // Filter a collection based on a specific property
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        LambdaExpressionDemo<Integer> isEven = n -> n % 2 == 0;
        Collection<Integer> evenNumbers = Utility.filter(numbers, isEven);
        System.out.println(evenNumbers); // Output: [2, 4, 6]
    }
}