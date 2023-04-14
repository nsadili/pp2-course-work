package arithmeticoperations;

public class SquareRoot extends UnaryOperation {
    
   public SquareRoot(EvalInterface op1 , String label){

    super(op1,label);  // label = sqrt 

   }

    @Override
    public double calculate(EvalInterface op1) {

       return Math.sqrt(op1.toValue());
    }

    @Override
    public String toString() {
        return String.format("sqrt(%.2f)", op1.toValue());
    }
    
}
