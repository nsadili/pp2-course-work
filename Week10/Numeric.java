package Week10;

public class Numeric<T extends Number> {
    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }

    public boolean absoluteEqual(Numeric<?> other) {
        double abs1 = Math.abs(value.doubleValue());
        double abs2 = Math.abs(other.value.doubleValue());
        return abs1 == abs2;
    }

    public static void main(String[] args) {
        Numeric<Double> num1 = new Numeric<>(-5.6);
        Numeric<Float> num2 = new Numeric<>(3.9f);
    
        System.out.println("Reciprocal of " + num1.value + " is " + num1.reciprocal());
        System.out.println("Fractional part of " + num2.value + " is " + num2.fractionalPart());
    
        if (num1.absoluteEqual(num2)) {
            System.out.println("The absolute values of " + num1.value + " and " + num2.value + " are equal.");
        } else {
            System.out.println("The absolute values of " + num1.value + " and " + num2.value + " are not equal.");
        }
    }
    
}


