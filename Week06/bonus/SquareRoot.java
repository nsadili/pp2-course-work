public class SquareRoot extends UnaryOperation {
    public SquareRoot(int num) {
    }

    @Override
    protected double calc(double num) {
        return  Math.sqrt(num);
    }

}
