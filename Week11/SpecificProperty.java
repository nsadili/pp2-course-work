import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpecificProperty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(filter(list, (i) -> i % 2 == 1));
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, -1));
        points.add(new Point(-1, 1));
        points.add(new Point(-1, -1));
        System.out.println(filter(points, (p) -> p.x > 0 && p.y > 0));
        List<String> strings = new ArrayList<>();
        strings.add("The quick brown fox jumps over the lazy dog");
        strings.add("The quick brown fox jumps over the lazy dog.");
        strings.add("The quick brown fox jumps over the lazy dog!");
        strings.add("The quick brown fox jumps over the lazy dog?");
        System.out.println(filter(strings, (s) -> s.length() == 43));
        List<Person> people = new ArrayList<>();
        people.add(new Person("Javid", "Ibadov", 21));
        people.add(new Person("Mehdi", "Jedayev", 20));
        people.add(new Person("huseyn", "Ahmedov", 19));
        people.add(new Person("Feride", "Huseynov", 18));
        System.out.println(filter(people, (p) -> p.age > 20));
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        Collection<T> result = new ArrayList<>();
        for (T t : c) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}

interface SpecificProperty<T> {
    boolean test(T t);
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}