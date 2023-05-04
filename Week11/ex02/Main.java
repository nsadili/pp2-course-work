package Week11.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import Week06.Point;

@FunctionalInterface
interface SpecificProperty<T> {
    boolean test(T t);
}

public class Main {
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;
        SpecificProperty<String> isPanagram = s -> s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredIntegers = (List<Integer>) filter(integerList, isOdd);
        System.out.println(filteredIntegers);

        List<Point> pointList = Arrays.asList(new Point(1, 2), new Point(-3, 4), new Point(5, 6), new Point(7, -8));
        List<Point> filteredPoints = (List<Point>) filter(pointList, isInFirstQuadrant);
        System.out.println(filteredPoints);

        List<String> stringList = Arrays.asList("Hello world", "Matrix is the best movie ever", "Windows is my favorite OS(!)",
                                                     "The quick brown fox jumps over the lazy dog"); // this one is panagram
        List<String> filteredStrings = (List<String>) filter(stringList, isPanagram);
        System.out.println(filteredStrings);


        List<Person> personList = Arrays.asList(new Person("Sadiq", "Mammadov", 19), new Person("Ali", "Aliyev", 25), new Person("Charlie", "Chaplin", 30), new Person("Adolf", "Hitler", 3));
        List<Person> filteredPersons = (List<Person>) filter(personList, isOlderThan20);
        System.out.println(filteredPersons);
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> filteredList = new ArrayList<>();
        for (T element : c) {
            if (p.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}