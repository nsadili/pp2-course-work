package Week11.SpecificProperty;

import java.awt.Point;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Part A");
        System.out.println();
        System.out.println();
    


        SpecificProperty<Integer> isOdd = n -> n % 2 == 1;
        System.out.println("Is odd: " + isOdd.check(10));
        System.out.println("Is odd: " + isOdd.check(13));
        
        SpecificProperty<Point> isFirstQuadrant = p -> p.x > 0 && p.y > 0;
        System.out.println("Is first quadrant: " + isFirstQuadrant.check(new Point(3, 4)));
        System.out.println("Is first quadrant: " + isFirstQuadrant.check(new Point(8, -9)));
        
        SpecificProperty<String> isPanagram = str -> str.chars()
                                                        .filter(Character::isLetter)
                                                        .map(Character::toLowerCase)
                                                        .distinct()
                                                        .count() == 26;
        System.out.println("Is panagram: " + isPanagram.check("Sixty zippers were quickly picked from the woven jute bag."));
        System.out.println("Is panagram: " + isPanagram.check("Programming Principles.")); 
        
        SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;
        Person p1 = new Person("Someone", "Randomovich", 25);
        Person p2 = new Person("Naik", "Pashayev", 18);
        System.out.println("Is older than 20: " + isOlderThan20.check(p1));
        System.out.println("Is older than 20: " + isOlderThan20.check(p2)); 

        System.out.println();
        System.out.println();
        System.out.println("Part B");
        System.out.println();
        System.out.println();
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collection<Integer> oddNumbers = filter(numbers, isOdd);
        System.out.println(oddNumbers); 
        
        List<Point> points = List.of(new Point(3, 4), new Point(-1, 2), new Point(5, -3), new Point(0, 0));
        Collection<Point> firstQuadrantPoints = filter(points, isFirstQuadrant);
        System.out.println(firstQuadrantPoints);
        
        List<String> strings = List.of("The quick brown fox jumps over the lazy dog", "Hello world", "Pack my box with five dozen liquor jugs");
        Collection<String> panagrams = filter(strings, isPanagram);
        System.out.println(panagrams); 
        
        List<Person> people = List.of(p1, p2);
        Collection<Person> olderThan20 = filter(people, isOlderThan20);
        System.out.println(olderThan20); 
    }
    
    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::check).collect(Collectors.toList());
    }
}


