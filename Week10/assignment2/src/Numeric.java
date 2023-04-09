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
        return 1 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() % 1;
    }

    public boolean absoluteValueEqual(Numeric<? extends Number> other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.getValue().doubleValue());
    }
}
