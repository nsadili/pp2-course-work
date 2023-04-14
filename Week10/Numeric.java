package Week10;

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

    public double reciprocal() throws ArithmeticException {
        if(value.doubleValue() == 0){throw new ArithmeticException("Cannot find the reciprocal of zero");}
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() % 1.0;
    }

    public <N extends Number> boolean absEqual(N other) {
        return Math.abs(this.value.doubleValue()) == Math.abs(other.doubleValue());
    }

    public <N> boolean absEqual(Numeric<? extends Number> other) {
        return absEqual(other.getValue());
    }

}
