package Week06;

public class Circle extends Shape implements Movable {
    protected Point center;
    protected double radius;
    public Circle() {
        this(1.0);
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Point center) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}
