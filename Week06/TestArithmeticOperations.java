
import arithmeticoperations.Div;
import arithmeticoperations.Factorial1;
import arithmeticoperations.Operand;
import arithmeticoperations.SquareRoot;
import arithmeticoperations.Subtr;
import arithmeticoperations.Sum;

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

        Operand a= new Operand("s", 19);
        
        Subtr s1=new Subtr(a,x);
        System.out.println(s1.toString());
        System.out.println(s1.toValue());

        SquareRoot ss= new SquareRoot(x, "sqrt");
        System.out.println(ss.toValue());
        System.out.println(ss);

        Factorial1 f = new Factorial1(x, "fact");
        System.out.println(f.toValue());
        System.out.println(f);




    }
}
