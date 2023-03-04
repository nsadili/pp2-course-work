package arithmetic.bonus;

public class TestArithmeticOperations {
    public static void main(String[] args) {

        Operand x = new Operand("x", 5);
        Operand y = new Operand("y", 15);
        Operand z = new Operand("z", 3);

        Sum s = new Sum(x, y);

        Sum s2 = new Sum(new Sum(x, y), z);

        System.out.println(s.toString());
        System.out.println(s.toValue());

        System.out.println(s2.toString());
        System.out.println(s2.toValue());
    }
}
