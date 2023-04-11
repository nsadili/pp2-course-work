package week10.generics;

public class Numeric <T extends Number> {
    private T value;

    public Numeric(T value){
    this.value=value;
    }

    public T getValue() {
        return value;
    }

    public double reciprocal(){
        if(value.doubleValue()==0)
            throw new ArithmeticException("Cannot find");
        return 1/ value.doubleValue();
    }

    public double fractional(){
        return value.doubleValue()- value.intValue();
    }
    public <N extends Number> boolean compareAbs(N another){
    return true;
    }
    }
