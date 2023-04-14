public class NumericClass<T extends Number> {

    private T number;

    NumericClass(T number) {
        this.number = number;
    }

    public double reciprocal() {
        if (number.doubleValue() == 0)
            throw new ArithmeticException("Division by Zero");

        return 1 / number.doubleValue();
    }

    public double fractional() {
        if (number.doubleValue() == 0)
            throw new ArithmeticException("Division by Zero");

        return number.doubleValue() - Math.floor(number.doubleValue()); // number.doubleValue() % 1

    }

    public <N extends Number> boolean check(N num2) {

        return (Math.abs(num2.doubleValue()) == Math.abs(number.doubleValue()));

    }

    public  boolean check(NumericClass<? extends Number> num2) {
            
        return check(num2.number);

        // return (Math.abs(num2.number.doubleValue()) == Math.abs(number.doubleValue()));

    }

    public static void main(String[] args) {

        NumericClass<Integer> number1 = new NumericClass<Integer>(19);

        System.out.println(number1.check(19.00));
        System.out.println(number1.reciprocal());

        NumericClass<Double> number2 = new NumericClass<>(19.9);
        NumericClass<Double> number3 = new NumericClass<>(0.0);

        // System.out.println(number3.fractional()); 
        System.out.println(number2.fractional());

        System.out.println(number1.check(number2));

    }

}
