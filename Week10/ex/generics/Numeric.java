package generics;

public class Numeric<T extends Number> {
    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public double reciprocal() {

        if(value.doubleValue() == 0) 
        throw new ArithmeticException("Cannot find reciprocal of ZERO!");
        return 1 / value.doubleValue();
    }

    public double fractional() {

        return value.doubleValue() - value.intValue();
    }

    public boolean checkAbsoluteValue(float value1, double value2) {

        if (Math.abs(value1) == Math.abs(value2))

            return true;
        else
            return false;

    }


    public <U extends Number> boolean checkAbs(U number) {

        return Math.abs(value.doubleValue()) == Math.abs(number.doubleValue());
    }

    public <U extends Number> boolean checkAbs(Numeric<? extends Number> numeric) {
        // return Math.abs(value.doubleValue()) == Math.abs(numeric.getValue().doubleValue());
        return checkAbs(numeric.getValue());
    }

    


    



    
}
