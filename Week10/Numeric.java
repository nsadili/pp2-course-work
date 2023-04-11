package Week10;

public class Numeric<T extends Number> {
    private T value;
    public Numeric(T el){
    this.value=value;
    }
    public T getValue(){
        return value;
    }
    public double reciprocal() throws Exception{
        if(value.doubleValue()==0)
    throw new ArithmeticException();
        return 1/value.doubleValue();
       
        
    }
    public double fractional(){
        return value.doubleValue()- value.intValue();
        
    }
    public <N extends Number> boolean compareAbs(N another){

        return Math.abs(this.value.doubleValue())==Math.abs(another.doubleValue());
        
    }
    public <N extends Number> boolean compareAbs(Numeric<? extends Number> other){
        
        return true;
        
    }
}
