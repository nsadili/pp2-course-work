package generics;

public class GenericNumeric<T extends Number> {
    public static void main(String[] args) {
        GenericNumeric<Double> df = new GenericNumeric<>(3.5);
        System.out.println(df.getReciprocal()); 
        System.out.println(df.getFractionalPart()); 
        System.out.println(df.isAbsoluteEqual(-2.6)); 
        
        GenericNumeric<Float> ff = new GenericNumeric<>(4.7f);
        System.out.println(ff.getReciprocal()); 
        System.out.println(ff.getFractionalPart()); 
        System.out.println(ff.isAbsoluteEqual(-4.7f)); 
    }

    private T value; 
    
    public GenericNumeric(T value) {
        this.value = value;
    }
    public double getReciprocal() {
        return 1.0 / value.doubleValue();
    }
    
    public double getFractionalPart() {
        return value.doubleValue() - Math.floor(value.doubleValue());
    }
    
    public boolean isAbsoluteEqual(T other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.doubleValue());
    }
    
}
