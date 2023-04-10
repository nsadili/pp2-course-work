package GenericNumeric;

public class NumericDemo {
    public static void main(String[] args) {
        Numeric<Float> num = new Numeric<>(2f);

        Numeric<Integer> num2 = new Numeric<>(2);

        System.out.println(num.getValue());

        System.out.println(num.reciprocal());

        System.out.println(num.fractional());

        System.out.println(num.compareAbs(2.5));
        
        System.out.println(num.compareAbs(num2));
    }
}