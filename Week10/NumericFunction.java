public class NumericFunction <T extends Number> {
    
    T num;

    public NumericFunction(T num) {
        this.num = num;
    }

    public void print() {
        System.out.println(num);
    }

    public double getReciprocal() {
        return 1.0 / num.doubleValue();
    }

    public double getFraction() {
        return num.doubleValue() - num.intValue();
    }

    public boolean isEqual(NumericFunction<?> other) {
        return Math.abs(num.doubleValue()) == Math.abs(other.num.doubleValue());
    }

}
