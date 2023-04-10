public class Numeric<T extends Number> {
    private T value;;

    public Numeric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double reciprocal() throws Exception {
        if (value.doubleValue() == 0)
            throw new Exception(" ");
        return 1 / value.doubleValue();

    }

    public double fractional() {
        return value.doubleValue() - value.intValue();
    }

    public <N extends Number> boolean compareAbs(double d) {
        return true;

    }
}