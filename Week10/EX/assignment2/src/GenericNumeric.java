public class GenericNumeric<T extends Number> {
    private T value;

    public GenericNumeric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() - Math.floor(value.doubleValue());
    }

    public boolean isEqualAbsoluteValue(T other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.doubleValue());
    }

    public static void main(String[] args) {
        GenericNumeric<Double> doubleNumber = new GenericNumeric<>(-5.5);
        System.out.println("Value: " + doubleNumber.getValue());
        System.out.println("Reciprocal: " + doubleNumber.reciprocal());
        System.out.println("Fractional part: " + doubleNumber.fractionalPart());
        System.out.println("Absolute value equality with Float: " + doubleNumber.isEqualAbsoluteValue((double) 2.5f));

        GenericNumeric<Integer> intNumber = new GenericNumeric<>(7);
        System.out.println("Value: " + intNumber.getValue());
        System.out.println("Reciprocal: " + intNumber.reciprocal());
        System.out.println("Fractional part: " + intNumber.fractionalPart());
        System.out.println("Absolute value equality with Long: " + intNumber.isEqualAbsoluteValue((int) -7L));
    }
}