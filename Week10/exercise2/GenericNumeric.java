package exercise2;

public class GenericNumeric<T extends Number> {
    private T value; 

    public GenericNumeric(T value) { 
        this.value = value; 
    }

    // Getter and Setter methods
    public T getValue() { 
        return value;
    }

    public void setValue(T value) { 
        this.value = value;
    }

    // Method to calculate the reciprocal of the value
    public double reciprocal() { 
        return 1.0 / value.doubleValue(); 
    }

    // Method to calculate the fractional part of the value
    public double fractionalPart() { 
        return value.doubleValue() % 1; 
    }

    // Method to check if the absolute value of two values are equal
    public boolean absoluteValueEqual(T otherValue) { 
        return Math.abs(value.doubleValue()) == Math.abs(otherValue.doubleValue()); // Compare the absolute values
    }

    public static void main(String[] args) {
        GenericNumeric<Double> num1 = new GenericNumeric<>(5.0); 
        System.out.println(num1.reciprocal()); 
        System.out.println(num1.fractionalPart()); 

        GenericNumeric<Float> num2 = new GenericNumeric<>(-3.14159f);
        System.out.println(num2.absoluteValueEqual(-3.14159f)); 
    }
}
