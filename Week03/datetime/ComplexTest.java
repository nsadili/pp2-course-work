package Week03.datetime;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("c1 == c2: " + c1.equals(c2));
        System.out.println("c1 real part: " + c1.re());
        System.out.println("c1 imaginary part: " + c1.imag());

        ComplexNumber c3 = c1.conjugate();
        System.out.println("c1 conjugate: " + c3);
        System.out.println("c1 absolute value: " + c1.abs());

        ComplexNumber c4 = c1.add(c2);
        System.out.println("c1 + c2: " + c4);

        ComplexNumber c5 = c1.sub(c2);
        System.out.println("c1 - c2: " + c5);

        ComplexNumber c6 = c1.mult(c2);
        System.out.println("c1 * c2: " + c6);
    }
}
