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

    public Numeric<T> reciprocal() {
        double reciprocal = 1.0 / value.doubleValue();
        return new Numeric<T>((T) getNumber(reciprocal));
    }

    public Numeric<T> fractionalPart() {
        double fractional = value.doubleValue() % 1;
        return new Numeric<T>((T) getNumber(fractional));
    }

    public boolean isEqualAbsoluteValue(Numeric<?> other) {
        double thisAbs = Math.abs(value.doubleValue());
        double otherAbs = Math.abs(other.getValue().doubleValue());
        return thisAbs == otherAbs;
    }

    private Number getNumber(double value) {
        if (value == (int) value) {
            return (int) value;
        } else {
            return value;
        }
    }
}
