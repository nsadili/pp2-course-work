package bonus;


public class Sum extends Binary {

    public Sum(Eval p1, Eval p2) {
        super("+", p1, p2);
    }

    @Override
    protected double calculate(Eval p1, Eval p2) {
        return p1.toValue() + p2.toValue();
    }

}