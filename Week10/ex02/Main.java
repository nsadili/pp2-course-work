package Week10.ex02;

class Numeric<T extends Number> {
    private T value;
    
    public Numeric(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public double reciprocal() {
        return 1 / value.doubleValue();
    }
    
    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }
    
    public boolean isAbsoluteEqual(Numeric<? extends Number> other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.getValue().doubleValue());
    }
}


public class Main {
    public static void main(String[] args) {
        Numeric<Double> num1 = new Numeric<>(5.0);
        System.out.println(num1.reciprocal());
        System.out.println(num1.fractionalPart()); 

        Numeric<Float> num2 = new Numeric<>(-3.7f);
        System.out.println(num2.reciprocal());
        System.out.println(num2.fractionalPart()); 

        
        Numeric<Double> num3 = new Numeric<>(-2.0);
        Numeric<Float> num4 = new Numeric<>(2.0f);
        System.out.println(num3.isAbsoluteEqual(num4)); 
    }
}
