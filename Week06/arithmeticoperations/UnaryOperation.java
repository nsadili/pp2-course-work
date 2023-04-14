package arithmeticoperations;

public abstract class UnaryOperation implements EvalInterface {

    protected EvalInterface op1;
    private String label;  // factorial or square root

    public UnaryOperation(EvalInterface op1, String label){
        this.label=label;
        this.op1=op1;
    }

    public abstract double calculate(EvalInterface op1);

    @Override
    public double toValue(){
        return calculate(op1);
    }

    

    
    
}
