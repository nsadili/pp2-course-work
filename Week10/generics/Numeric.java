package generics;
public class Numeric<T extends Number> {
    T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        if(value.doubleValue()==0)
            throw new ArithmeticException("No ZERO");
        return 1 / value.doubleValue();
    }
    public <U extends Number> boolean checkAbs(U number){
        return Math.abs(value.doubleValue())==Math.abs(number.doubleValue());
    }
    public boolean checkAbs(Numeric<? extends Number> numeric){
        return checkAbs(numeric);
    }
    public double fraction() {
        return value.doubleValue() - value.intValue();
    }
    public <T> boolean checkAbs(T number){
        return false;
    }
}
