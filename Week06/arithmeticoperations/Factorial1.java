package arithmeticoperations;

public class Factorial1 extends UnaryOperation{

    public Factorial1(EvalInterface op1, String label){
        super(op1, label); //label = fact

    }

    @Override
    public double calculate(EvalInterface op1) {
        var i=1;
        var fact=1;
        for(i=1;i<=op1.toValue();i++){
                fact*=i;
        }

        return fact;
    }

   
}
