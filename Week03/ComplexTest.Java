public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, -4);
        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 + c2 = " + c1.add(c2).toString());
        System.out.println("c1 - c2 = " + c1.sub(c2).toString());
        System.out.println("c1 * c2 = " + c1.mult(c2).toString());
        System.out.println("|c1| = " + c1.abs().toString());
        System.out.println("conjugate of c1 = " + c1.conjugate().toString());
        System.out.println("c1 to the power of 3 = " + c1.power(3).toString());
    }
}