package pp2.week03.math;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, -1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("c1 equals c2? " + c1.equals(c2));

        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.sub(c2));
        System.out.println("c1 * c2 = " + c1.mult(c2));

        System.out.println("Conjugate of c1 = " + c1.conjugate());
        System.out.println("Absolute value of c2 = " + c2.abs());

        int n = 3;
        System.out.println("c1 ^ " + n + " = " + c1.pow(n));
    }
}