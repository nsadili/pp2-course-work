import java.awt.Point;
import java.util.*;
import java.util.stream.*;

interface SpecificProperty<T> {
    boolean check(T value);
}

class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("The quick brown fox jumps over the lazy dog");
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = p -> p.x > 0 && p.y > 0;
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;
        Boolean isPanagram = words.stream().sorted().collect(Collectors.toSet()).size() == 26;
        
        System.out.println(isOdd.check(4)); 
        
        System.out.println(isInFirstQuadrant.check(new Point(2, 3)));
        
        Person person1 = new Person("John", "Doe", 25);
        
        
        System.out.println(isOlderThan20.check(person1)); 
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
    
    public int getAge() {
        return age;
    }
}

