public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
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
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }

    public Resizable resize(double num) {
        this.radius *= num;
        return this;
    }
}
