public class TestArithmeticOperations {
    public static void main(String[] args) {
        Operand x = new Operand("x", 5);
        Operand y = new Operand("y", 15);
        Operand z = new Operand("z", 3);

        Sum s = new Sum(x, y);

        Sum s2 = new Sum(new Sum(x, y), x);

        Subtr n = new Subtr(x, y);

        Mult m = new Mult(x, z);

        Div d = new Div(new Div(y, x), z);

        System.out.println(s.toString());
        System.out.println(s.toValue());

        System.out.println(s2.toString());
        System.out.println(s2.toValue());

        System.out.println(n.toString());
        System.out.println(n.toValue());

        System.out.println(m.toString());
        System.out.println(m.toValue());

        System.out.println(d.toString());
        System.out.println(d.toValue());

    }

}
