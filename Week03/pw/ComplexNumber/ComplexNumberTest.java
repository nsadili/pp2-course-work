import pp2.week03.math.ComplexNumber;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 equals c2: " + c1.equals(c2));

        System.out.println("c1 real part: " + c1.re());
        System.out.println("c1 imaginary part: " + c1.imag());

        System.out.println("c1 conjugate: " + c1.conjugate());
        System.out.println("c1 absolute value: " + c1.abs());

        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.sub(c2));
        System.out.println("c1 * c2: " + c1.mult(c2));
    }
}