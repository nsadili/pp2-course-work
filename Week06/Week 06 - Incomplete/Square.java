public class Square extends Rectangle implements Resizable{

    public Square() {
        super(1, 1);
    }

    public Square(double a) {
        super(a, a);
    }

    public Square(double a, String color, boolean filled) {
        super(a, a, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "Square["+super.toString()+", side="+super.getWidth();
    }

    public void resize(double factor) {
        super.a *= factor;
    }

}