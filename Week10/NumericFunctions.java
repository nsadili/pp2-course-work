public class NumericFunctions<T extends Number> {

    private T number;

    public NumericFunctions(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1.0 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() - number.intValue();
    }

    public boolean isEqualAbsoluteValue(Number other) {
        if (number instanceof Double && other instanceof Double) {
            return Math.abs(number.doubleValue()) == Math.abs(other.doubleValue());
        } else if (number instanceof Float && other instanceof Float) {
            return Math.abs(number.floatValue()) == Math.abs(other.floatValue());
        } else {
            return false;
        }
    }
}
