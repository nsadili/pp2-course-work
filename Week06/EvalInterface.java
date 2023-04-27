public class Operand implements EvalInterface{

    private double value;
    public string label;

    public Operand(String label, double value){

        this.label = label;
        this.value = value;
    }
    @Override
    public double toValue(){
        return value;

    }
    @Override
    public String toString(){
        return label;
    }
}

public interface EvalInterface{
    double toValue();
    String toString();
}

public abstract class BinaryOperation implements EvalInterface{
private EvalInterface op1;
private EvalInterface op2;
private String label;

public  BinaryOperation(String label, EvalInterface op1, EvalInterface op2){
this.op1=op1;
this.op2=op2;
this.label = label;
}

protected abstract double calculate(EvalInterface op1, EvalInterface op2);

@Override

public double toValue(){
    return calculate(op1, op2);

}

@Override
public String toString(){
    return "( "+ op1.toString() + " " + label + " "+ op2 + " )";
}
}

public class Sum extends BinaryOperation{
    public Sum(EvalInterface op1, EvalInterface op2){
super("+ " op1, op2); 
    }
    @Overrideprotected double calculate(EvalInterface op1, EvalInterface op2){
        return op1.toValue() + op2.toValue();
    }
    }
    public class TestArithmeticOperations{
        Run | Debug
        public class void main(String[]args){
            Operation x = new Operand("x", 5);
        Operation y = new Operand("y", 15);
            Operation z = new Operand("z", 3);
         Sum s = new Sum(x,y);
         Sum s2 = new Sum(new Sum(x,y),x);

        System.out.println(s.toString());
        System.out.println(s.toValue());

        System.out.println(s2.toString());
        System.out.println(s2.toValue());



        }
    }