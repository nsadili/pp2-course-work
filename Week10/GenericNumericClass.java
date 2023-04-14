public class NumericFunction<T extends Number> {
    private final T number;

    public NumericFunction(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1.0 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() % 1;
    }

    public boolean equalsAbs(NumericFunction<?> other) {
        return Math.abs(number.doubleValue()) == Math.abs(other.number.doubleValue());
    }

    public static void main(String[] args) {
        NumericFunction<Double> doubleFunc = new NumericFunction<>(-1.23);
        NumericFunction<Float> floatFunc = new NumericFunction<>(1.23f);

        System.out.println("Reciprocal of doubleFunc: " + doubleFunc.reciprocal());
        System.out.println("Fractional part of doubleFunc: " + doubleFunc.fractionalPart());
        System.out.println("Reciprocal of floatFunc: " + floatFunc.reciprocal());
        System.out.println("Fractional part of floatFunc: " + floatFunc.fractionalPart());
        System.out.println("Absolute value of doubleFunc and floatFunc are equal? " + doubleFunc.equalsAbs(floatFunc));
    }
}

