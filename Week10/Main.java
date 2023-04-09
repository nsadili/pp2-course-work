import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> ints = Arrays.asList(12, 14, 17, 20, 25);
        Collection<String> strs = Arrays.asList("apple", "anna", "bob", "alice");
        
        NumericFunction<Float> nf = new NumericFunction<>(20.5f);
        NumericFunction<Double> nf2 = new NumericFunction<Number>(20.5);

        System.out.println(nf.isEqual(nf2));

        Counter counter = new Counter();
        int count = counter.count(ints, new EvenProperty());
        System.out.println(count);

        int count2 = counter.count(strs, new PalindromeProperty());
        System.out.println(count2);

    }
}
