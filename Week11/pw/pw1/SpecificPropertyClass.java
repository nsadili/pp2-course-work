package Week11.pw.pw1;

import java.util.*;

public class SpecificPropertyClass {
    public static void main(String[] args) {
        SpecificProperty<Integer> oddIntegerProperty = n -> n % 2 != 0;
        SpecificProperty<Point> firstQuadrantProperty = p -> p.getX() > 0 && p.getY() > 0;
        SpecificProperty<String> pangramProperty = SpecificPropertyClass::checkPangram;
        SpecificProperty<Person> olderThan20Property = p -> p.getAge() > 20;

        Point pt1 = new Point(9.3f, 4.6f);
        System.out.println(firstQuadrantProperty.test(pt1));
        Point pt2 = new Point(0.03f, -5.1f);
        System.out.println(firstQuadrantProperty.test(pt2));
        System.out.println(pangramProperty.test("Hello World"));
        System.out.println(pangramProperty.test("The quick brown fox jumps over the lazy dog"));
        Person p1 = new Person("Taghi", "Mammadov", 18);
        System.out.println(olderThan20Property.test(p1));
        Person p2 = new Person("Tom", "Anderson", 35);
        System.out.println(olderThan20Property.test(p2));

        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 3, 6, 1, 11, 0, -4, -17, 51, 8, 2);
        Collection<Integer> oddInts = Utility.filter(ints, oddIntegerProperty);
        for (int i : oddInts) System.out.print(i + " ");
        System.out.println();
    }

    static boolean checkPangram(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);

            if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }

        return set.size() == 26;
    }
}