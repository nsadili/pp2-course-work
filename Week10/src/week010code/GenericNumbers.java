package week010code;

public class GenericNumbers<T extends Number> {
	
	private T number;

	public GenericNumbers(T number) {
		
		this.number = number;
		
	}

	public T getNumber() {
		
		return number;
		
	}

	public void setNumber(T number) {
		
		this.number = number;
		
	}

	public GenericNumbers<Double> getReciprocal() {
		
		return new GenericNumbers<>(1.0 / number.doubleValue());
		
	}

	public GenericNumbers<Double> fractionalPart() {
		
		return new GenericNumbers<Double>(number.doubleValue() - number.intValue());
		
	}

	public boolean isAbsolute(GenericNumbers<?> otherValue) {
		
		return Math.abs(getNumber().doubleValue()) == Math.abs(otherValue.getNumber().doubleValue());
		
	}
}
