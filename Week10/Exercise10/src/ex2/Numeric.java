package ex2;

public class Numeric<T extends Number> {
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
    
    // b
    public double getReciprocal() {
        return 1 / number.doubleValue();
    }

    // c
    public double getFractionalPart() {
        return number.doubleValue() % 1;
    }

    // d
    public boolean absoluteValueIsEqual(Numeric<?> num2) {
        return Math.abs(number.doubleValue()) == Math.abs(num2.number.doubleValue());
    }
}
