package Ex05;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, 4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.re() = " + c1.re());
        System.out.println("c1.imag() = " + c1.imag());
        System.out.println("c1.conjugate() = " + c1.conjugate());
        System.out.println("c1.abs() = " + c1.abs());
        System.out.println("c1.add(c2) = " + c1.add(c2));
        System.out.println("c1.sub(c2) = " + c1.sub(c2));
        System.out.println("c1.mult(c2) = " + c1.mult(c2));
        System.out.println("c1.power(2) = " + c1.power(2));
    }
}
