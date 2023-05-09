package Week10;

public class Num <T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }
    public Num(T value) {
        this.value = value;
    }
    public double reciprocal() {
        return (1 / value.doubleValue());
    }
    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }
    public boolean isAbsolute(Num<?> otherValue) {
        return Math.abs(value.doubleValue()) == Math.abs(otherValue.getValue().doubleValue());
    }
}