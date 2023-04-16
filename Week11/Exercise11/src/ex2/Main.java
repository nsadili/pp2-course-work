package ex2;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    interface SpecificProperty<T> {
        boolean checkIf(T a);
    }

    public static void main(String args[]) {
        // a
        SpecificProperty<Integer> oddInt = (Integer n) -> (n % 2 != 0) ? true : false;
        int a = 11;
        System.out.println("Number is odd: " + oddInt.checkIf(a));

        SpecificProperty<Point> firstQuadrant = (Point p) -> (p.getX() > 0 && p.getY() > 0) ? true : false;
        Point p1 = new Point(10, 20);
        Point p2 = new Point(-5, 15);
        System.out.println("Point1 is in the first quadrant: " + firstQuadrant.checkIf(p1));
        System.out.println("Point2 is in the first quadrant: " + firstQuadrant.checkIf(p2));

        SpecificProperty<String> panagram = (String s) -> {
            int[] letters = new int[26];
            for (char c: s.toLowerCase().toCharArray())
                if (c != ' ') letters[c - 'a']++;

            for (int i: letters)
                if (i == 0) return false;

            return true;
        };
        String s1 = "The quick brown fox jumps over the lazy dog";
        String s2 = "Not a panagram sentence";
        System.out.println("String1 is a panagram: " + panagram.checkIf(s1));
        System.out.println("String2 is a panagram: " + panagram.checkIf(s2));

        SpecificProperty<Person> oldEnough = (Person p) -> {
            if (Integer.compare(p.getAge(), 20) > 0)
                return true;
            
            return false;
        };
        Person person1 = new Person("Ali", "Garashli", 18);
        Person person2 = new Person("Aziz", "Gurbanli", 22);
        System.out.println("Person1 is older than 20: " + oldEnough.checkIf(person1));
        System.out.println("Person2 is older than 20: " + oldEnough.checkIf(person2));
        System.out.println();


        // b
        Collection<Integer> intList = new LinkedList<>();
        intList.add(2); intList.add(5); intList.add(11); intList.add(-20); intList.add(0);
        System.out.println("Odd integers filtered: " + filter(intList, oddInt));

        Collection<Person> personList = new LinkedList<>();
        Person person3 = new Person("Bob", "Sponge", 35);
        personList.add(person1); personList.add(person2); personList.add(person3);
        System.out.println("Old enough people filtered: " + filter(personList, oldEnough).toString());
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        Collection<T> res = new LinkedList<>();
        for (T x: c) {
            if (p.checkIf(x)) res.add(x);
        }

        return res;
    }
}
