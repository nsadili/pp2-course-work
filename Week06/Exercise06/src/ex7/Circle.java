package ex7;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {};

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
}
