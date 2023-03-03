package shapes;

public class Rectangle2 extends Shape implements Resizable{
    protected double width = 1.0;
    protected double length = 1.0;

    public void resize(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle2(){}
    public Rectangle2(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle2(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double w) {
        this.width = w;
    }
    public void setLength(double l) {
        this.length = l;
    }


    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[ " + super.toString() + ", width= "+ this.width + ", length=" + this.length+ " ]";
    }
}
