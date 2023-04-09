package Week10;

public class Numeric <A extends Number> {
    private A value;

    public A getValue() {
        return value;
    }

    public Numeric(A value) {
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
        Numeric<Double> numericValue1 = new Numeric<>(5.7983);
        System.out.println(numericValue1.fractionalPart());
    }
}