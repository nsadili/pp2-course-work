package Numeric;

public class NumericTest {
    public static void main(String[] args) {
        NumericFunction<Integer> intFunc = new NumericFunction<>(10);
        NumericFunction<Double> doubleFunc = new NumericFunction<>(9.76);
        NumericFunction<Float> floatFunc = new NumericFunction<>(-3.14f);

        // Test reciprocal() method
        System.out.println("Reciprocal of " + intFunc.number + " is " + intFunc.reciprocal());
        System.out.println("Reciprocal of " + doubleFunc.number + " is " + doubleFunc.reciprocal());
        System.out.println("Reciprocal of " + floatFunc.number + " is " + floatFunc.reciprocal());

        // Test fractionalPart() method
        System.out.println("Fractional part of " + intFunc.number + " is " + intFunc.fractionalPart());
        System.out.println("Fractional part of " + doubleFunc.number + " is " + doubleFunc.fractionalPart());
        System.out.println("Fractional part of " + floatFunc.number + " is " + floatFunc.fractionalPart());

        // Test equalAbsoluteValue() method
        System.out.println("Absolute value of " + intFunc.number + " and " + doubleFunc.number + " are equal? " + intFunc.equalAbsoluteValue(doubleFunc));
        System.out.println("Absolute value of " + doubleFunc.number + " and " + floatFunc.number + " are equal? " + doubleFunc.equalAbsoluteValue(floatFunc));
    }
}
