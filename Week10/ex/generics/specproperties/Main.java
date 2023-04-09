package generics.specproperties;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 5, 6, 8, 3, 7, 9);

        System.out.println(Utility.count(numbers, new EvenIntegerProperty()));
        System.out.println(Utility.count(numbers, new OddIntegerProperty()));
        System.out.println(Utility.filter(numbers, new EvenIntegerProperty()));
    }
}
