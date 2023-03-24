package Week06.ArithmeticOperations;

public class Div extends BinaryOperation {

    public Div(EvalInterface op1, EvalInterface op2) {
        super("/", op1, op2);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected double calcluate(EvalInterface op1, EvalInterface op2) {
        // TODO Auto-generated method stub

        return (double) op1.toValue() / (double) op2.toValue();
    }

}
