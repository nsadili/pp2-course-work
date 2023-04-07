public class Exercise_2<T extends Number> {
    private T value;

    //declaration of the value
    public Exercise_2(T value) {
        this.value = value;
    }

    //declaration of reciprocal. the method will return value divided on any double one
    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    //declaration if fractionPart. returns the fractional part of the value held by the value field of the Numeric object.
    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }

    //declaration of absoluteEqual method. The purpose of it is to compare two given values between each other
    public boolean absoluteEqual(Exercise_2<?> other) {
        double abs1 = Math.abs(value.doubleValue());
        double abs2 = Math.abs(other.value.doubleValue());
        return abs1 == abs2;
    }

//main method, which checks all methods above
    public static void main(String[] args) {
        Exercise_2<Double> num1 = new Exercise_2<>(-99.9);
        Exercise_2<Float> num2 = new Exercise_2<>(356.6f);
    
        System.out.println("Reciprocal of " + num1.value + " is " + num1.reciprocal());
        System.out.println("Fractional part of " + num2.value + " is " + num2.fractionalPart());
    
        if (num1.absoluteEqual(num2)) {
            System.out.println("The absolute values of " + num1.value + " and " + num2.value + " are equal.");
        } else {
            System.out.println("The absolute values of " + num1.value + " and " + num2.value + " are not equal.");
    }
}

}