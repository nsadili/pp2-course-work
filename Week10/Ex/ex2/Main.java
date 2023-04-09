package Ex.ex2;

public class Main {
    public static void main(String[] args) {
        Numeric<Double> num1 = new Numeric<>(3.0);
        Numeric<Integer> num2 = new Numeric<>(-3);
        Numeric<Float> num3 = new Numeric<>(-3.0f);

        double reciprocal = num1.reciprocal();
        double fractionalPart = num2.fractionalPart();
        boolean absoluteEquals = num1.absoluteEquals(num3);

        System.out.println("Reciprocal of " + num1 + ": " + reciprocal);
        System.out.println("Fractional part of " + num2 + ": " + fractionalPart);
      
      
     
        System.out.println("Absolute equality of " + num1 + " and " + num3 + ": " + absoluteEquals);
    }
}
