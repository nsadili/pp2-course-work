package Week10;

public class NumericFunction<T extends Number> {
    private T number;

    public NumericFunction(T number) {
        this.number = number;
    }

    // Method to return the reciprocal of a number
    public double getReciprocal() {
        return 1 / number.doubleValue();
    }

    // Method to return the fractional part of a number
    public double getFractionalPart() {
        return number.doubleValue() - number.intValue();
    }

    // Method to check the absolute value of two types for equality
    public boolean checkAbsoluteEquality(NumericFunction<?> other) {
        return Math.abs(number.doubleValue()) == Math.abs(other.getNumber().doubleValue());
    }

    // Getter for the number
    public T getNumber() {
        return number;
    }

    // Setter for the number
    public void setNumber(T number) {
        this.number = number;
    }
}

