package Week11;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SpecificProperty<Integer> checkOdd = num -> num % 2 != 0;
        SpecificProperty<Point> checkQuadrant = point -> point.getX() > 0 && point.getY() > 0;
        SpecificProperty<Person> checkAge = person -> person.age > 20;
        SpecificProperty<String> checkPanagram = str -> {
            Set<Character> checking = new HashSet<Character>();
            for (Character a : str.toLowerCase().toCharArray()) {
                if (a >= 'a' && a <= 'z')
                    checking.add(a);
            }
            return checking.size() == 26;

        };
        System.out.println("Check odd: " + checkOdd.check(135));
        System.out.println("Check age: " + checkAge.check(new Person("Murad", "Tahmazli", 19)));
        System.out.println("Check quadrant: " + checkQuadrant.check(new Point(-3, 6)));
        System.out.println("Check Panagram: "+ checkPanagram.check("The quick brown fox jumps over the lazy dog"));

    }

}

class Person {
    String firstname;
    String lastname;
    Integer age;

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}


 class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
}