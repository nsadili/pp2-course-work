import pp2.week03.math.ComplexNumber;

public class ComplexNumbeTest {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(8.0,4.0);
        ComplexNumber n2 = new ComplexNumber(2.0, 6.0);
        
        System.out.println(n1.equals(n2));

        System.out.println(n1.toString());

        System.out.println(n1.re());

        System.out.println(n1.imag());
        System.out.printf("absolute value of number 1: %f\n", n1.abs());
        System.out.println("adding n2 to number: " + n1.add(n2));
        System.out.println("substracting n2 from the n1: " + n1.sub(n2));
        System.out.println("multiplying n2 to the n1: " + n1.mult(n2));
    }
}
