package Week10;

import Week10.generics.Numeric;

public class NumericTest {
    public static void main(String[] args) {
        Numeric<Double> num = new Numeric<>(5.5);
        Numeric<Float> num2 = new Numeric<>(5.5f);
        System.out.println(num.reciprocal());
        System.out.println(num.fractional());
        System.out.println(num.equalAbsValue(5));
        System.out.println(num.equalAbsValue(num2));

    }
}
