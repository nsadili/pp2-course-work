package generics;

public class GenericNumericFunction<T> {
    public static void main(String[] args) {

        Numeric<Double> num = new Numeric<>(2.5);

        System.out.println(num.reciprocal());
        System.out.println(num.fractional());

        System.out.println(num.checkAbsoluteValue(2.5f, 2.5));
        System.out.println(num.checkAbsoluteValue(2.5f, 2.6));
    }

}