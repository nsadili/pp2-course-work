package Week10;

public class GenericNumeric<T extends Number> {
    private T number;

    public GenericNumeric(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() - number.intValue();
    }

    public boolean absoluteValueEqual(T number) {
        return Math.abs(this.number.doubleValue()) == Math.abs(number.doubleValue());
    }
}