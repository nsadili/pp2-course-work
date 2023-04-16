package generics;

public class Point {
    private float x;
    private float y;

    // accessor -> getter methods
    // modifier -> setter methods

    // default constructor
    public Point() {
        this(0, 0); // this constructor
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append('(');
        sb.append(this.x);
        sb.append(',');
        sb.append(this.y);
        sb.append(')');

        return sb.toString();
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }
}
