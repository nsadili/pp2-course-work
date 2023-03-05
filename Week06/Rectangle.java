package Week06;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width+length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
