package EX;

public class Circle extends Shape implements Movable {
    private Point p;
    private double r;

    public Circle() {
        this.r = 1;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.r = r;

    }

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public Movable moveUp(int steps) {
        p.moveUp(steps);
        return this;
    }

    @Override
    public Movable moveDown(int steps) {
        p.moveDown(steps);
        return this;

    }

    @Override
    public Movable moveLeft(int steps) {
        p.moveLeft(steps);
        return this;
    }

    @Override
    public Movable moveRight(int steps) {
        p.moveRight(steps);
        return this;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Circle))
            return false;
        Circle that = (Circle) obj;
        return that.r == this.r && that.p == this.p;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + r + "]";

    }
}