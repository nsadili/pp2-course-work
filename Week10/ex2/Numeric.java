package Week10.ex2;

public class Numeric<T extends Number> {
    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        if (value.doubleValue() == 0)
            throw new ArithmeticException("Division by zero.");
        return 1 / value.doubleValue();
    }

    public double fractionalPart() {
        return Math.abs(value.doubleValue() - value.intValue());
    }

    public <N extends Number> boolean isAbsEqualTo(N num) {
        return Math.abs(value.doubleValue()) == Math.abs(num.doubleValue());
    }

    public boolean isAbsEqualTo(Numeric<? extends Number> num) {
        return isAbsEqualTo(num.getValue());
    }

    public T getValue() {
        return value;
    }
}
