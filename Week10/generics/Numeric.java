package generics;

public class Numeric<T extends Number> {

    T value;
    
    public Numeric(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double reciprocal() {
        return 1 / value.doubleValue();
    }

    public double fractional() {
        return value.doubleValue() - value.intValue();
    }

    public<N extends Number> boolean compareAbs(N another) {
        return Math.abs(value.doubleValue()) == Math.abs(another.doubleValue());
    }

    public boolean compareAbs(Numeric<? extends Number> other) {
        return compareAbs(other.getValue());
    }
    
}
