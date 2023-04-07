package generics;

public class GenericNumeric <T extends Number>{
    
    private T a;
    public GenericNumeric(T a){
        this.a=a;
    }
    public T getA() {
        return a;
    }
    public double reciprocal() throws Exception{
        if(a.doubleValue()==0){
            throw new Exception("Cannot be divided into 0");
        }
        return 1/a.doubleValue();
    }
    public double fractional(){
        return a.doubleValue()-a.intValue();
    }
    public <B extends Number> boolean cmpAbsolute(B b){
        return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
    }

    public boolean cmpAbsolute(GenericNumeric<? extends Number> c){
        return cmpAbsolute(c.getA().doubleValue());
    }
}