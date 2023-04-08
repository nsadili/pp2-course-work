package Week10.ex2;

public class Numberic <T extends Number> {

    private T value;

    public Numberic(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public double reciprocal() throws Exception{
        if (value.doubleValue() == 0)throw new Exception("Cannot divide to 0");
        return 1 / value.doubleValue();
    }

    public double fractional(){
        return value.doubleValue() - value.intValue();
    }

    public <N extends Number> boolean compareAbs(N another){
        return Math.abs(this.value.doubleValue()) == Math.abs(another.doubleValue());
    }

    public boolean compareAbs(Numberic<? extends Number> other){
        return compareAbs(other.getValue());
    }
}
