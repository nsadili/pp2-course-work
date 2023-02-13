import math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber num = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(2, 5);

        System.out.println(num.mult(num2));
    }
}
