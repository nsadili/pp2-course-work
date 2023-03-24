package Week06.ArithmeticOperations;

public class Mult extends BinaryOperation {

    public Mult(EvalInterface op1, EvalInterface op2) {
        super("*", op1, op2);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected double calcluate(EvalInterface op1, EvalInterface op2) {
        // TODO Auto-generated method stub
        return op1.toValue() * op2.toValue();
    }

}
