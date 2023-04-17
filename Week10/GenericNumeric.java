package Week10;
import java.math.*;
public class GenericNumeric<T extends Number> {
    public T num;
    
    public GenericNumeric(T num) {
        this.num=num;
    }

    public double reciprocal(T num){
     return 1.0/num.doubleValue();
    }

    public double fraction(T num){
    double a= Math.floor(num.doubleValue());
    return (num.doubleValue()-a);
    }
    public boolean isEqual(GenericNumeric<?> other){
    return Math.abs(num.doubleValue()) == Math.abs(other.num.doubleValue());
    }
   
}
