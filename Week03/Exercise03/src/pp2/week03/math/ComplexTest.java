package pp2.week03.math;

public class ComplexTest {
    public static void main(String args[]) {
        double x = 2;
        double y = 5;
        ComplexNumber asd = new ComplexNumber(x, y);
        ComplexNumber qwe = new ComplexNumber(2.1, 5.0);
        System.out.println(asd.add(qwe).getReal());
    }
}
