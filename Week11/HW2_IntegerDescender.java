package Week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW2_IntegerDescender {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(3);
        Collections.sort(numbers, (a, b) -> b.compareTo(a));
        System.out.println(numbers);
    }
    
}
