import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainClassSpecificProperty {
    public static void main(String[] args) {
        //Check if the integer is odd
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;

        //Check if the point is in the first quadrant
        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;

        //Check if the given string is a Pangram
        SpecificProperty<String> isPangram = s -> s.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;

        //Check if the given Person ( firstname (String), lastname (String), age (int) ) is older than 20
        SpecificProperty<Person> isOlderThan20 = p -> p.getAge() > 20;
    }

    //filter method
    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> result = new ArrayList<>();
        for (T element : c) {
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }


}
