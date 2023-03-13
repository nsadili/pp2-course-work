package week03.math;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(1,2); // 1 + 2i
        ComplexNumber d = new ComplexNumber(1,-2); // 1 - 2i
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(c.add(d).toString());
        System.out.println(c.sub(d).toString());
        System.out.println(c.mult(d).toString());
    }
}
