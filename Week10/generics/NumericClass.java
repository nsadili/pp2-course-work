package Week10.generics;

public class NumericClass<T extends Number> {
    private T value;

    public NumericClass(T value) {
        this.value = value;
    }

    public double calcReciprocal(){
		return 1.0 / value.doubleValue();
        
    }
    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }

    public boolean isEqualAbsoluteValue(T otherValue) {
        double absValue = Math.abs(value.doubleValue());
        double otherAbsValue = Math.abs(otherValue.doubleValue());
        return absValue == otherAbsValue;
    }


    public static void main(String[] args) {
        NumericClass<Integer> integerNumeric = new NumericClass<Integer>(5);
                System.out.println("Reciprocal of 5: " + integerNumeric.calcReciprocal()); 
                System.out.println("Fractional part of 5: " + integerNumeric.fractionalPart()); 
                System.out.println("Is the absolute value of 5 equal to -4? " + integerNumeric.isEqualAbsoluteValue(-4)); 
        
                // Test with Double
                NumericClass<Double> doubleNumeric = new NumericClass<>(9.76);
                System.out.println("Reciprocal of 9.76: " + doubleNumeric.calcReciprocal()); 
                System.out.println("Fractional part of 9.76: " + doubleNumeric.fractionalPart());
                System.out.println("Is the absolute value of 9.76 equal to -9.76? " + doubleNumeric.isEqualAbsoluteValue(-9.76));
            }

        
}


