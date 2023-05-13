public class Ex_2_Generic_Numeric_class {
    public static void main(String[] args) {

        Numeric<Double> x = new Numeric<>(3.0);
        Numeric<Float> y = new Numeric<>(-3.0f);

        Numeric<Double> xReciprocal = x.reciprocal(); // returns a Numeric<Double> with value -0.3333333333333333
        Numeric<Double> xFractional = x.fractionalPart(); // returns a Numeric<Double> with value 0.0
        boolean isEqualAbs = x.isEqualAbsoluteValue(y); // returns true

        System.out.println(isEqualAbs);
        System.out.println(xReciprocal.getValue());
        System.out.println(xFractional.getValue());

    }

}