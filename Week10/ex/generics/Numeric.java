package generics;

public class Numeric<T extends Number> {
    T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {

        return 1 / value.doubleValue();
    }

    public double fractional() {

        return value.doubleValue() - value.intValue();
    }

    public boolean checkAbsoluteValue(float value1, double value2) {

        if (Math.abs(value1) == Math.abs(value2))

            return true;
        else
            return false;

    }
}
