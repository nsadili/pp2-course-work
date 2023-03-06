package BONUS;

public class TestArithmeticOperations {
    public static void main(String args[]) {
        Operand x = new Operand(5, "x");
        Operand y = new Operand(15, "y");
        Operand z = new Operand(3, "z");
        Sum s = new Sum(y, z);
        Sum s2 = new Sum(new Sum(x, y), x);
        Subtr s3 = new Subtr(y, z);
        Mult s4 = new Mult(x, y);
        Div s5 = new Div(x, y);
        Factoriala s6 = new Factoriala(x);

        // System.out.println(s.toString());
        // System.out.println(s.toValue());
        // System.out.println(s2.toString());
        // System.out.println(s2.toValue());
        System.out.println(s6.toString());
        System.out.println(s6.toValue());
    }

}
