import java.util.Arrays;
import java.util.List;

import specproperties.EvenIntegerProperty;
import specproperties.PalindromeProperty;
import specproperties.Utility;

public class Main {
    public static void main(String[] args) {
        
    
    Numeric<Double> num = new Numeric<>(2.5);
   Numeric<Integer> num2 = new Numeric<>(3);
    System.out.println(num.reciprocal());
    System.out.println(num.fractional());
    num.checkAbs(5.0);
    //num.checkAbs("hello");
    System.out.println(num.checkAbs(num2));
    System.out.println(num.checkAbs(0));

    List<Integer> numbers = Arrays.asList(4,2,6,6,5,4,3,9);
    int count = Utility.count(numbers, new EvenIntegerProperty());
    System.out.println(count);

}
}