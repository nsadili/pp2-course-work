package Week10;

public class Numeric <T extends Number>{
    private T number;

    public Numeric(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double reciprocal() {
        if (number.doubleValue() == 0.0) {
            throw new ArithmeticException("Cannot calculate reciprocal of zero");
        }
        return 1 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() % 1;
    }

    public boolean isEqualAbsoluteValue(T otherNumber) {
        double thisValue = Math.abs(number.doubleValue());
        double otherValue = Math.abs(otherNumber.doubleValue());
        return thisValue == otherValue;
    }

}
