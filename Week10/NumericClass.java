package generics;

public class Numeric <T extends Number> {


    private T value; 
    public Numeric(T el){
        thsi.value= value;


    }
    public T getValue(){
        return value;
    }

public double reciprocal(){
    if(value.doubleValue() == 0)
    throw new Exception(message:"Cannot find reciprocal of Zero");

        return 1 / value.doubleValue();
}
    public double fractional(){

        return value.doubleValue() - value.intVakue();

    }

    public <N extends Number> boolean compareAbs(N another){
        return math.abs(this.value.doubleValue())==Math.abs(another.doubleValue());
    }
    
    public boolean compareAbs(Numeric<? extends Number> other){
            return true;
    

    }

}


