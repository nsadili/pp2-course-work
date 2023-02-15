package Week03.math;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 5);
        ComplexNumber number2 = new ComplexNumber(10, 6);
        System.out.println(number1.toString());
        System.out.println(number1.equals(number2));
        System.out.println(number1.add(number2));
        System.out.println(number1.sub(number2));
        System.out.println(number1.re());
        System.out.println(number2.imag());
        System.out.println(number1.conjugate());
    }
}
