package Week08;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(34);
        numbers.add(64);
        numbers.add(99);
        numbers.add(23);

        
        Collections.sort(numbers);
        System.out.println(numbers.toString());

        
        numbers.sort(new ComparatorForExerciseTwo());
        System.out.println(numbers.toString());

        ComparatorForExerciseTwo c = new ComparatorForExerciseTwo();
        Collections.sort(numbers, c);
        System.out.println(numbers.toString());
    }
}
