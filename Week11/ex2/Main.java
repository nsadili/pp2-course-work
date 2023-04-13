package ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SpecificProperty<Integer> oddProp = num -> num % 2 != 0;

        SpecificProperty<Point> firstQuad = point -> point.getX() > 0 && point.getY() > 0;

        SpecificProperty<Person> moreTwenty = person -> person.getAge() > 20;

        SpecificProperty<String> panagram = str -> {

            Set<Character> set = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (c >= 'a' && c <= 'z')
                    set.add(c);

                if (c >= 'A' && c <= 'Z') {
                    c = Character.toLowerCase(c);
                    set.add(c);
                }
            }

            return set.size() == 26;

        };

        System.out.println("Number is odd: " + oddProp.check(5));

        System.out.println("Point is on first quadrant: " + firstQuad.check(new Point(-4, 6)));

        System.out.println("Age is more than 20: " + moreTwenty.check(new Person("Vasila", "Aliyeva", 18)));
        
        System.out.println("String is a panagram: " + panagram.check("The quick brown fox jumps over the lazy dog"));

    }

}
