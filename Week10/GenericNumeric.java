package Week10;

public class GenericNumeric <T extends Number> {
    private T num;
    public GenericNumeric(T number) {
        this.num = number;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public GenericNumeric<Double> getRecip() {
        return new GenericNumeric<>(1.0 / num.doubleValue());
    }

    public GenericNumeric<Double> fractPart() {
        return new GenericNumeric<Double>(num.doubleValue() - num.intValue());
    }

    public boolean isAbsolute(GenericNumeric<?> otherValue) {
        return Math.abs(getNum().doubleValue()) == Math.abs(otherValue.getNum().doubleValue());
    }
}
