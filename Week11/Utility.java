package Ex2;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface SpecificProperty<T> {
    boolean test(T t);
}

public class Utility {

    public static <T> int count(Collection<T> c, SpecificProperty<T> p) {
        int count = 0;
        for (T elem : c) {
            if (p.test(elem)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> filteredList = new ArrayList<>();
        for (T elem : c) {
            if (p.test(elem)) {
                filteredList.add(elem);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = (n) -> n % 2 != 0;
        System.out.println(isOdd.test(5)); 
        System.out.println(isOdd.test(6)); 
        
        SpecificProperty<Point> isFirstQuadrant = (p) -> p.x > 0 && p.y > 0;
        Point p1 = new Point(1, 1);
        Point p2 = new Point(-1, 1);
        System.out.println(isFirstQuadrant.test(p1)); 
        System.out.println(isFirstQuadrant.test(p2)); 
        
        SpecificProperty<String> isPangram = (s) -> {
            String lowerCaseStr = s.toLowerCase();
            for(char c = 'a'; c <= 'z'; c++) {
                if(lowerCaseStr.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPangram.test("The quick brown fox jumps over the lazy dog.")); 
        System.out.println(isPangram.test("The quick brown fox jumps over the lazy cat.")); 
        
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
        SpecificProperty<Person> isOlderThan20 = (p) -> p.getAge() > 20;
        Person person1 = new Person("David", "Bekham", 25);
        Person person2 = new Person("Ilqar", "Malikov", 18);
        System.out.println(isOlderThan20.test(person1)); 
        System.out.println(isOlderThan20.test(person2));
        
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> oddNumbers = filter(List.of(arr), isOdd);
        System.out.println(oddNumbers); 
    }
}

