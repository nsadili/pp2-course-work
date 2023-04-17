package EX;

public class NumericTest {
    public static void main(String[] args){
        Numeric<Double> num = new Numeric<>(45.23);
        System.out.println(num.fraction());
        System.out.println(num.reciprocal());
        System.out.println(num.checkAbs(num));
    }
}

class Numeric<T extends Number> {
private T value;

    public Numeric(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }

    public double reciprocal(){
        if(this.value.doubleValue() == 0.0){
            throw new ArithmeticException();
        }
        return 1/this.value.doubleValue();
    }

    public double fraction(){
        return this.value.doubleValue() - (double)this.value.intValue();
    }
    
    public <U extends Number> boolean checkAbs(U num){
        return Math.abs(this.value.doubleValue()) == Math.abs(num.doubleValue());
    }
    public boolean checkAbs(Numeric<? extends Number> num){
        return checkAbs(num.getValue());
    }
}
