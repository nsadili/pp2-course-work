
public class Numeric<T extends Number> {

    T value;

    public Numeric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double reciprocal() {
        if (value.doubleValue() == 0)
            throw new ArithmeticException("Value can not be '0'");
        return 1.0 / value.doubleValue();
    }

    public double fractional() {
        if (value.doubleValue() < 0)
            return value.doubleValue() - value.intValue() + 1;
        else
            return value.doubleValue() - value.intValue();
    }
    
    public <U extends Number> boolean checkAbs(U number){
        return  Math.abs(value.doubleValue())== Math.abs(number.doubleValue());
    }
    public boolean checkAbsolute(Numeric<?> numeric) {
        return checkAbs(numeric.getValue());

    }
}
