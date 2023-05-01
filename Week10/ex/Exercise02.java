package Week10.ex;

class Numeric<T extends Number> {
    public T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() % 1;
    }

    public boolean isEqualAbsoluteValue(Numeric<?> other) {
        double absValue1 = Math.abs(value.doubleValue());
        double absValue2 = Math.abs(other.value.doubleValue());
        return absValue1 == absValue2;
    }
}

public class Exercise02 {
    public static void main(String[] args) {
      
        Numeric<Integer> num1 = new Numeric<>(5);
        System.out.println("Reciprocal of " + num1.value + ": " + num1.reciprocal());
        System.out.println("Fractional part of " + num1.value + ": " + num1.fractionalPart());

        Numeric<Double> num2 = new Numeric<>(5.67);
        System.out.println("Reciprocal of " + num2.value + ": " + num2.reciprocal());
        System.out.println("Fractional part of " + num2.value + ": " + num2.fractionalPart());

        Numeric<Float> num3 = new Numeric<>(-3.14f);
        System.out.println("Reciprocal of " + num3.value + ": " + num3.reciprocal());
        System.out.println("Fractional part of " + num3.value + ": " + num3.fractionalPart());

        Numeric<Long> num4 = new Numeric<>(100L);
        System.out.println("Reciprocal of " + num4.value + ": " + num4.reciprocal());
        System.out.println("Fractional part of " + num4.value + ": " + num4.fractionalPart());

        Numeric<Double> num5 = new Numeric<>(-3.64);
        System.out.println("Reciprocal of " + num5.value + ": " + num5.reciprocal());
        System.out.println("Fractional part of " + num5.value + ": " + num5.fractionalPart());

        Numeric<Float> num6 = new Numeric<>(-2.5f);
        System.out.println("Reciprocal of " + num6.value + ": " + num6.reciprocal());
        System.out.println("Fractional part of " + num6.value + ": " + num6.fractionalPart());

        Numeric<Double> num7 = new Numeric<>(3.14);
        Numeric<Float> num8 = new Numeric<>(3.14f);
        System.out.println("Is absolute value of " + num7.value + " equal to absolute value of " + num8.value + "? "
                + num7.isEqualAbsoluteValue(num8));
    }
}

