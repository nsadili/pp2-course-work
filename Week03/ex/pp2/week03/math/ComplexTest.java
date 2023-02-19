package pp2.week03.math;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(2,5); // 2 + 5i
        ComplexNumber d = new ComplexNumber(5,-3); // 5 - 3i
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(c.add(d).toString());
        System.out.println(c.sub(d).toString());
        System.out.println(c.mult(d).toString());
    }
}
