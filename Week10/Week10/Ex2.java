package Week10;

public class Ex2 <T extends Number> {
    private T number;

    public Ex2(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Ex2<Double> getReciprocal() {
        return new Ex2<>(1.0 / number.doubleValue());
    }

    public Ex2<Double> fractionalPart() {
        return new Ex2<Double>(number.doubleValue() - number.intValue());
    }

    public boolean isAbsolute(Ex2<?> otherValue) {
        return Math.abs(getNumber().doubleValue()) == Math.abs(otherValue.getNumber().doubleValue());
    }
}