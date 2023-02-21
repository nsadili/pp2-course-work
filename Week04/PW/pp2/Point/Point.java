package pp2.Point;

public class Point {
    private float x;
    private float y;

    public Point() {
        this(1, 1);
    }

    public Point(float x1, float y1) {
        this.x = x1;
        this.y = y1;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getx() {
        return x;
    }

    public void setx(float x) {
        this.x = x;
    }

    public float gety() {
        return y;
    }

    public void sety(float y) {
        this.y = y;
    }

    public void translate(float dx, float dy) {
    }

    public float distance(Point p2) {
        return 0;
    }
}