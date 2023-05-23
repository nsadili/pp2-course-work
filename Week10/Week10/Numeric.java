package Week10;

public class Numeric <T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return (1 / value.doubleValue());
    }

    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }

    public boolean isAbsolute(Numeric<?> otherValue) {
        return Math.abs(value.doubleValue()) == Math.abs(otherValue.getValue().doubleValue());
    }
}

class Main2 {
    public static void main(String[] args) {
        Numeric<Double> numericValue1 = new Numeric<>(4.3456);
        System.out.println(numericValue1.fractionalPart());
    }
}