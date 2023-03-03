package Week05.src.Geometry2;

public class Point2 {
    private float x;
    private float y;

    public Point2() {
    }

    public Point2(float x, float y) {
        this.x = y;
        this.y = y;
    }

    public Point2(Point2 p) {

        this(p.x, p.y);
    }

    public float getX() {

        return x;
    }

    public void setX(float x) {

        this.x = x;
    }

    public float getY() {

        return y;
    }

    public void setY(float y) {

        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point2 p) {
        return (float) Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }

    public boolean equals(Point2 p) {
        return this.x == p.getX() && this.y == p.getY();
    }

}