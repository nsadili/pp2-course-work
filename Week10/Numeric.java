public class Numeric<T extends Number> {
    T value; 

    public Numeric(T value) {
        this.value = value;
    }
    public Double reciprocal() {
        return 1/value.doubleValue();
    }

    public double fractional() {
        return value.doubleValue()-value.intValue();
    }

}
