import generics.Numeric;

public class NumericTest {
    public static void main(String[] args) {

        Numeric<Double> n1 = new Numeric<>(4.0);
        Numeric<Integer> n2 = new Numeric<>(9);
        Numeric<Float> n3 = new Numeric<>(-4.0f);

        double reciprocal = n1.reciprocal();
        double fractionalPart = n2.fractionalPart();
        boolean absoluteEquals = n1.absoluteEquals(n3);

        System.out.println("Number 1 Reciprocal: " + reciprocal);
        System.out.println("Number 2 Fractional part: " + fractionalPart);
        System.out.println("Number 1 and Number 3 Absolute equality: " + absoluteEquals);
    }
}