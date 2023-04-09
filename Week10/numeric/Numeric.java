package numeric;

public class Numeric <T extends Number> {
    T value;

    public Numeric(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    public double reciprocal(){
        if(value.doubleValue() == 0)
            throw new ArithmeticException("Can not find the reciprocal!!!");

        return 1 / value.doubleValue();
    }

    public double fractional(){
        return value.doubleValue() - value.intValue();
    }

    public <U extends Number> boolean checkAbs(U number){
        return Math.abs(value.doubleValue()) == Math.abs(number.doubleValue());
    }

    public boolean checkAbs(Numeric<? extends Number> numeric){
      return checkAbs(numeric.getValue());
    }
}
