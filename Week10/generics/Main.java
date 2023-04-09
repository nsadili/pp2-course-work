import java.util.Arrays;
import java.util.List;

import specproperties.EvenIntegerProperty;
import specproperties.PalindromeProperty;
import specproperties.Utility;

public class Main {
    public static void main(String[] args) {
        Numeric<Double> num = new Numeric<>(0.0);
        Numeric<Integer> num2 = new Numeric<>(0);
        System.out.println(num.reciprocal());
        System.out.println(num.fractional());
        System.out.println(num.checkAbs(num2));
        System.out.println(num.checkAbs(2));

        List<Integer> numbers = Arrays.asList(4,2,5,7,4,3,5,6);
        System.out.println(Utility.count(numbers, new EvenIntegerProperty()));
    }
}
