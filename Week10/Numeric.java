public class Numeric <T extends Number>{
    private T value;

    public Numeric(T value) {
        this.value=value;
    }

    public T getValue() {
        return this.value;
    } 

    public double reciprocal() {
            return 1/this.value.doubleValue();
    }

    public double fractional() {
        return this.value.doubleValue()-this.value.intValue();
    }

    public <N extends Number> boolean compareAbs(N another) {
        return Math.abs(value.doubleValue())==Math.abs(another.doubleValue());
    }

    public boolean compareAbs(Numeric<? extends Number> other) {
        return compareAbs(other.getValue());
    }
}