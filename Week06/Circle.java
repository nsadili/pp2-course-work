public class Circle extends Shape implements Movable, Resizeable {

    private Point center;
    protected double radius = 1;

    public Circle() {
        this(1, "red", true);
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        if (radius < 0)
            radius = 0;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Movable moveUp(int step) {
        center.moveUp(step);
        return this;

    }

    @Override
    public Movable moveDown(int step) {
        center.moveDown(step);
        return this;

    }

    @Override
    public Movable moveLeft(int step) {
        center.moveLeft(step);
        return this;
    }

    @Override
    public Movable moveRight(int step) {
        center.moveRight(step);
        return this;
    }

    @Override
    public String toString() {

        return "Circle " + super.toString();

    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

    @Override
    public double getPerimetr() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public void resize(double size) {

        this.radius *= size;
    }

}
