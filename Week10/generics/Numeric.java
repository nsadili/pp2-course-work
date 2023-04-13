package generics;
public class Numeric <T extends Number>{
    
    private T value;
    public Numeric(T el){
        this.value = value;

    }
    public T getValue() {
        return value;
    }

    public double reciprocal() {
        if(value.doubleValue()== 0) throw new ArithmeticException("Cannot be divided by 0");

        return 1/ value.doubleValue();
    }

    public double fractional(){
        return  value.doubleValue()- value.intValue();
    }

    public < N extends Number> boolean compareAbs(N another){
        
        return Math.abs(this.value.doubleValue()) == Math.abs(another.doubleValue());

    }

    public  boolean compareAbs(Numeric <? extends Number> other){
        return compareAbs(other.getValue());

    }


}
