package BONUS;

public class Factoriala extends UnaryOperation {
    
    
        public Factoriala(EvalInterface op1) {
    
            super(op1,"!");
        }
    
        @Override
        protected double calculate(EvalInterface op1) {
        long i=1,res=1;
for(i=1;i<=op1.toValue();i++){
    res*=i;
}
return res;
        }
    }
    
