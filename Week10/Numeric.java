class Numeric<T extends Number> {
    private T value;
    
    public Numeric(T value) {
        this.value = value;
    }
    
    public double reciprocal() {
        return 1 / value.doubleValue();
    }
    
    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }
    
    public boolean absoluteValueEquals(Numeric<?> other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.value.doubleValue());
    }
}
