public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber c1 = new ComplexNumber(2, 6);

        System.out.println("First complex number: " + c.toString());
        System.out.println("Second complex number: " + c1.toString());

        System.out.println("Equals test: " + c.equals(c1));

        System.out.println("Real part of the first complex number: " + c.re());
        System.out.println("Imaginary part of the first complex number: " + c.imag());

        System.out.println("Conjugate of the first complex number: " + c.conjugate());
        System.out.println("Absolute value of the first complex number: " + c.abs());

        System.out.println("Sum of the two complex numbers: " + c.add(c1));
        System.out.println("Difference of the two complex numbers: " + c.sub(c1));
        System.out.println("Product of the two complex numbers: " + c.mult(c1));
    }
}
