package generics;

public class GenericNumericFunction<T> {
    public static void main(String[] args) {

        Numeric<Double> num = new Numeric<>(2.5);
        Numeric<Integer> num2 = new Numeric<Integer>(0);

        try {
            System.out.println(num.reciprocal());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        System.out.println(num.fractional());

        System.out.println(num.checkAbsoluteValue(2.5f, 2.5));
        System.out.println(num.checkAbsoluteValue(2.5f, 2.6));

        System.out.println(num.checkAbs(5));
        // num.checkAbs("hello");

        System.out.println();

        System.out.println(num.checkAbs(num2));
        System.out.println(num.checkAbs(0));
    }

}