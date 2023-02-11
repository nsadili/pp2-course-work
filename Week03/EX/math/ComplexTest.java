package EX.math;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(10, 6);
        ComplexNumber number2 = new ComplexNumber(5, 2);
        System.out.printf("\nComplex number 1: %s\nReal part: %.2f\nImaginary part: %.2f\nConjugated version: %s\n",
        number1.toString(number1.x, number1.y), number1.re(), number1.imag(), number1.toString(number1.conjugate().x, number1.conjugate().y));
        System.out.printf("\nComplex number 2: %s\nReal part: %.2f\nImaginary part: %.2f\nConjugated version: %s\n",
        number2.toString(number2.x, number2.y), number2.re(), number2.imag(), number2.toString(number2.conjugate().x, number2.conjugate().y));
        System.out.printf("\nNumber 1 + number 2 = %s\nNumber 1 - number 2 = %s\nNumber 1 x number 2 = %s\n\n",
        number1.toString(number1.add(number2).x, number1.add(number2).y), number1.toString(number1.sub(number2).x, number1.sub(number2).y), number1.toString(number1.mult(number2).x, number1.mult(number2).y));
    }
}
