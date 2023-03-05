
public class Square extends Rectangle implements Resizeable {
    // a means side of square
    public Square(int a) {
        super(a, a);
    }

    public Square(int a, String color, boolean filled) {
        super(a, a, color, filled);
    }

    public double getSide() {
        return this.a;
    }

    public void setSide(double side) {
        this.a = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);

    }

    @Override
    public String toString() {
        return "Square " + "Shape[color:" + color + ", filled:" + this.filled + "]";
    }

}