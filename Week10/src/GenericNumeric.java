public class GenericNumeric<T extends Number> {
    
    private T value;
    
    public GenericNumeric(T value) {
        this.value = value;
    }
    
    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }
    
    public double fractionalPart() {
        return value.doubleValue() % 1.0;
    }
    
    public boolean absoluteEqual(GenericNumeric<?> other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.value.doubleValue());
    }
}
