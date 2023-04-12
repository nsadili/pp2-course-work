package specproperties;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(4, 2, 5, 7, 9);

        int count = Utility.count(numbers, new EvenInteger());
        System.out.println(count); 
}
}
