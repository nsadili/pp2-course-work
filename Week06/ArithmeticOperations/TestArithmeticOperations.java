package Week06.ArithmeticOperations;

public class TestArithmeticOperations {
    public static void main(String[] args) {
        Operand x = new Operand("x", 5);
        Operand y = new Operand("y", 15);
        Operand z = new Operand("z", 3);

        Sum s = new Sum(x, y);
        Sum s2 = new Sum(new Sum(x, y), x);

        System.out.println(s.toString());
        System.out.println(s.toValue());

        System.out.println(s2.toString());
        System.out.println(s2.toValue());

        Subtr s3 = new Subtr(z, y);

        System.out.println(s3.toString());
        System.out.println(s3.toValue());

        Mult s4 = new Mult(s2, s3);
        Div s5 = new Div(s3, s4);

        System.out.println(s4.toString());
        System.out.println(s4.toValue());

        System.out.println(s5.toString());
        System.out.println(s5.toValue());



    }
}
