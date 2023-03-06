package ex7;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {};

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        width = w;
        length = l;
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

    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2.0 * (width + length);
    }

    public String toString() {
        return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }
}
