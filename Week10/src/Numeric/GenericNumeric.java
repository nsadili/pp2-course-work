package Numeric;

public class GenericNumeric {
    public class NumericFunction<T extends Number> {
        public T value;

        public NumericFunction(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public double reciprocal() {
            return 1.0 / value.doubleValue();
        }

        public double fractionalPart(T number) {
            return number.doubleValue() - Math.floor(number.doubleValue());
        }

        public boolean absoluteValuesEqual(T number1, Number number2) {
            return Math.abs(number1.doubleValue()) == Math.abs(number2.doubleValue());
        }
    }

}