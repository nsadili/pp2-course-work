import java.util.Arrays;
import java.util.List;
// import generics.Numeric;
import specificproperties.EvenIntegerProperty;
// import specificproperties.PalindromeProperties;
import specificproperties.Utility;

public class Main {
    public static void main(String[] args) {

        // Numeric<Double> num = new Numeric<>(0.0);
        // Numeric<Integer> num2 = new Numeric<>(0);

        // try {
        // System.out.println(num.reciprocal());

        // } catch (ArithmeticException e) {
        // e.printStackTrace();
        // }

        // System.out.println(num.fractional());

        List<Integer> numbers = Arrays.asList(4, 3, 5, 6, 8, 9);

        System.out.println(Utility.count(numbers, new EvenIntegerProperty()));

    }

}
