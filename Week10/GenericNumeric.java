package Week10;

public class GenericNumeric <T extends Number> {
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

    public GenericNumeric<Double> getReciprocal() {
        return new GenericNumeric<>(1.0 / number.doubleValue());
    }

    public GenericNumeric<Double> fractionalPart() {
        return new GenericNumeric<Double>(number.doubleValue() - number.intValue());
    }

    public boolean isAbsolute(GenericNumeric<?> otherValue) {
        return Math.abs(getNumber().doubleValue()) == Math.abs(otherValue.getNumber().doubleValue());
    }
}
