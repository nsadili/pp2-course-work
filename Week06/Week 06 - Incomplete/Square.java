
public class Square extends Rectangle implements Resizeable{
    public Square(int a) {
        super(a, a);
    }
    public Square(int a, String color, boolean filled){
        super(a, a, color, filled);
    }

    //GETTER and SETTER
    public double getSide(){
        return this.a;
    }
    public void setSide(double a){
        this.a=a;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    ///
    public String toString() {
        return "Square Shape[color:"+getColor()+", filled:"+this.filled+"]";
    }

}