package Week11.ex.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.*;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 4, 2, 1, 6, 3, 2, 6, 9, 0, 1, -2, -9, -11, 3, 13, 17, 4, 3, 2, 1, 22, 23);
        Predicate<Integer> isOdd = i -> i % 2 == 1;
        Predicate<Integer> isEven = isOdd.negate();
        Function<Integer, Integer> addOne = i -> i + 1;

        boolean res1 = ints.stream()
            .filter(isOdd)
            .map(addOne)
            .allMatch(isEven);

        System.out.println(res1);

        long res2 = ints.stream()
            .limit(4)
            .count();

        System.out.println(res2);
    }
}