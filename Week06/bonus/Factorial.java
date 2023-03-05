public class Factorial extends UnaryOperation {
    public Factorial(int num) {
    }

    @Override
    protected double calc(double num) {
        int fact = 1;
        for (int i = 1; i <= (int) num; i++) {
            fact *= i;
        }
        return (int) fact;
    }

    

}
