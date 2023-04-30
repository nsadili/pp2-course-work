package exercises;

public class Numeric<T extends Number> {
	
	private T value;

	public T getValue() {
		
		return value;
	}

	public Numeric(T value) {
		
		this.value = value;
	}

	public double reciprocal() {
		
		return (1 / value.doubleValue());
		
	}

	public double fractionalPart() {
	
		return value.doubleValue() - value.intValue();
	}

	public boolean isAbsolute(Numeric<?> otherValue) {
		
        return Math.abs(value.doubleValue()) == Math.abs(otherValue.getValue().doubleValue());
    }
}