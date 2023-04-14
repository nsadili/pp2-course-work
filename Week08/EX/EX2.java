package Week08.EX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class EX2 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(13);
        //numbers.add(-15);
        numbers.add(7);
        numbers.add(9);

        List <Integer> number1 = new ArrayList<>(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);



    }
    
}
