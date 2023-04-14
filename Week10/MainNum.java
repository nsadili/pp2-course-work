package Week10;

import java.util.Arrays;
import java.util.List;

import Week10.Numeric;

public class MainNum {
    public static void main(String[] args) {
        Numeric<Long> num = new Numeric<>(123L);
        Numeric<Integer> num2 = new Numeric<>(321);

        System.out.println(num.getValue());

        System.out.println(num.reciprocal());

        System.out.println(num.fractionalPart());

        System.out.println(num.absEqual(25));
        System.out.println(num.absEqual(num2));



        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7); 
        int count = Util.count(list, new EvenIntegerProperty());

    }
    
}
