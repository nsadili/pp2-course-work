public class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public Movable moveUp(int steps) {
        this.center.moveUp(steps);
        return this;
    }

    public Movable moveDown(int steps) {
        this.center.moveDown(steps);
        return this;
    }

    public Movable moveLeft(int steps) {
        this.center.moveLeft(steps);
        return this;
    }

    public Movable moveRight(int steps) {
        this.center.moveRight(steps);
        return this;
    }
}
