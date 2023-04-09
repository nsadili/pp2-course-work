public class Main {

    public static void main(String[] args) {

        Numeric<Double> num1 = new Numeric<>(4.2);
        Numeric<Float> num2 = new Numeric<>(-2.3f);

        System.out.println("num1 reciprocal: " + num1.reciprocal());
        System.out.println("num2 fractional part: " + num2.fractionalPart());
        System.out.println("Absolute value of num1 and num2 is equal: " + num1.absoluteValueEqual(num2));

    }
}
