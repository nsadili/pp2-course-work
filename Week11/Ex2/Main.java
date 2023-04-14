package Week11.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SpecificProperty<Integer> integerSpec = n -> (n % 2) != 0;

        SpecificProperty<Point> pointSpec = p -> {
            if (p.getX() > 0 && p.getY() > 0)
                return true;
            return false;
        };

        SpecificProperty<String> stringSpec = str -> {
            List<Character> chars = new ArrayList<>(
                    Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
            char[] strChar = str.toLowerCase().toCharArray();
            for (char ch : strChar) {
                if (chars.contains(ch)) {
                    chars.remove(Character.valueOf(ch));
                }
            }
            // System.out.println(chars);
            return chars.isEmpty();
        };

        SpecificProperty<Person> personSpec = n -> {
            if (n.getAge() > 20)
                return true;
            return false;
        };

        // System.out.println(integerSpec.test(5));
        // System.out.println(integerSpec.test(8));

        // Point point1 = new Point(5, 10.5);
        // Point point2 = new Point(-8.3, 12);
        // System.out.println(pointSpec.test(point1));
        // System.out.println(pointSpec.test(point2));

        // System.out.println(stringSpec.test("baku"));
        // System.out.println(stringSpec.test("The quick brown fox jumps over a lazy
        // dog."));

        // Person person1 = new Person("Rufat", "Hajizada", 18);
        // Person person2 = new Person("Mahammad", "Mammadzada", 65);
        // System.out.println(personSpec.test(person1));
        // System.out.println(personSpec.test(person2));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(filter(arr, integerSpec));

        ArrayList<String> arr2 = new ArrayList<>(
                Arrays.asList("rufat", "The quick brown fox jumps over a lazy dog.",
                        "calculus", "Pack my box with five dozen liquor jugs.", "repaper", "madam"));
        System.out.println(filter(arr2, stringSpec));

        ArrayList<Person> arr3 = new ArrayList<>();
        arr3.add(new Person("Shamil", "Abbasov", 19));
        arr3.add(new Person("Arzum", "Abdullazada", 19));
        arr3.add(new Person("Muhammad", "Mammadzada", 65));
        System.out.println(filter(arr3, personSpec));

        ArrayList<Point> arr4 = new ArrayList<>();
        arr4.add(new Point(12, 19));
        arr4.add(new Point(-5, 1));
        arr4.add(new Point(-19, -25));
        System.out.println(filter(arr4, pointSpec));

    }

    static <T> Collection<?> filter(Collection<T> arr, SpecificProperty<T> p) {
        ArrayList<T> res = new ArrayList<>();

        for (T el : arr) {
            if (p.test(el))
                res.add(el);
        }

        return res;
    }
}
