


public class Numeric<T extends Number> {

    T value;
   
    public Numeric(T value){
        this.value=value;
    }
    public double reciprocal(){
return 1.0/value.doubleValue();
    }
    public double fractional(){
        return  value.doubleValue()-value.intValue();
    }
    public boolean comparison(Numeric<?> other){
       return Math.abs(value.doubleValue())==Math.abs(other.value.doubleValue());
    }
    
}
