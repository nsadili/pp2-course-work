
package Ex.ex2;


public class Numeric<T extends Number> {
    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() % 1.0;
    }

    public boolean absoluteEquals(Numeric<?> other) {
        double absValue = Math.abs(value.doubleValue());
        double otherAbsValue = Math.abs(other.value.doubleValue());
        return absValue == otherAbsValue;
    }

}
