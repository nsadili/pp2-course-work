public class ComplexTest {
    public static void main(String[] args) {

        ComplexNumber x = new ComplexNumber(1, 2);
        ComplexNumber y = new ComplexNumber(1, 2);

        System.out.println("x: " + x);
        System.out.println("x: " + y);
        System.out.println("x equals y: " + x.equals(y));
        System.out.println("x real part: " + x.re());
        System.out.println("x imaginary part: " + x.imag());
        System.out.println("x conjugate: " + x.conjugate());
        System.out.println("x absolute value: " + x.abs());
        System.out.println("x + y: " + x.add(y));
        System.out.println("x - y: " + x.sub(y));
        System.out.println("x * y: " + x.mult(y));
    }
}